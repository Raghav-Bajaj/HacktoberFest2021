const span1=document.querySelector('#p1');
const span2=document.querySelector('#p2');
const p1=document.querySelector('#p1Button');
const p2=document.querySelector('#p2Button');
const resetButton=document.querySelector('#Reset');
const winningScore=document.querySelector('#playto');


let p1score=0;
let p2score=0;
let isGameOver=false;
let wScore;

p1.addEventListener('click',function()
{
    if(!isGameOver)
    {
        p1score+=1;
        if(p1score === wScore){
        isGameOver=true;
        span1.classList.add('winner');
        span2.classList.add('loser');
        }
    }
    span1.innerText = p1score;
});
p2.addEventListener('click',function()
{
    if(!isGameOver)
    {
        p2score+=1;
        if(p2score === wScore){
        isGameOver=true;
        span2.classList.add('winner');
        span1.classList.add('loser');
        }
    }
    span2.innerText = p2score;
});

winningScore.addEventListener('change',function()
{
    wScore=parseInt(this.value);
    reset();
});
resetButton.addEventListener('click',reset)
function reset()
{
    isGameOver=false;
    p1score=0;
    p2score=0;
    span1.innerText=0;
    span2.innerText=0;
    span1.classList.remove('winner','loser');
    span2.classList.remove('winner','loser');

};