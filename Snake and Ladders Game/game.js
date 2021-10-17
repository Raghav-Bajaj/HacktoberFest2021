// Render Board Logic
function renderBoard() {
  const boardBlocks = [
    [20, 19, 18, 17],
    [16, 15, 14, 13],
    [9, 10, 11, 12],
    [8, 7, 6, 5],
    [1, 2, 3, 4]
  ]

  const snakes = {
    '7': '3',
    '11': '2',
    '14': '5',
    '17': '1'
  }

  const ladders = {
    '6': '13',
    '9': '15'
  }

  const boardContent = boardBlocks.map((blockRow) =>
    `<div class="row">
    ${
      blockRow.map((blockValue) => {
        const snakeTail = snakes[blockValue];
        const ladderHead = ladders[blockValue];
        return `
        <div
          class="col ${snakeTail ? 'snake' : ''} ${ladderHead ? 'ladder' : ''}"
          data-block="${blockValue}"
          ${ snakeTail ? `data-snake-tail="${snakeTail}"` : ''}
          ${ ladderHead ? `data-ladder-head="${ladderHead}"` : ''}
        >
          <b>${blockValue}</b>
          ${snakeTail ? `<br/>🐍 to ${snakeTail}` : ''}
          ${ladderHead ? `<br/>🪜 to ${ladderHead}` : ''}
        </div>
        `
      }).join('')
    }
    </div>`
  ).join('')

  document.querySelector('#board').innerHTML = boardContent;
}

// Roll Dice Logic
function setPlayerPosition(blockValue) {
  // Wins
  if (blockValue >= 20) {
    alert('Hurray!🎉 You won');
    setPlayerPosition(1);
    return;
  }

  const currentPlayerEl = document.querySelector('.col.player');
  if (currentPlayerEl) {
    currentPlayerEl.classList.remove('player');
  }

  const newPlayerEl = document.querySelector(`.col[data-block="${blockValue}"]`);
  newPlayerEl.classList.add('player');

  // Check if the new position where we moved has a snake
  if (newPlayerEl.dataset.snakeTail) {
    // If it has snake, set position to the tail of snake
    alert('Oops!!🤯 You were eaten by the snake');
    setPlayerPosition(parseInt(newPlayerEl.dataset.snakeTail))
  }

  if (newPlayerEl.dataset.ladderHead) {
    alert('Yay! You got the ladder');
    setPlayerPosition(parseInt(newPlayerEl.dataset.ladderHead));
  }
}

function getPlayerPosition() {
  const currentPlayerEl = document.querySelector('.col.player');
  const currentPlayerPosition = currentPlayerEl.dataset.block;
  return parseInt(currentPlayerPosition);
}

function rollDice() {
  const diceNumber = Math.round(Math.random() * (6 - 1) + 1);
  document.querySelector('#dice').innerText = diceNumber;

  const currentPosition = getPlayerPosition();
  setPlayerPosition(currentPosition + diceNumber);
}



// Main
renderBoard();
setPlayerPosition(1);
document.querySelector('#roll-dice').addEventListener('click', rollDice);
