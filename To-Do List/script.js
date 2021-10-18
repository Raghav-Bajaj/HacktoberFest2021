const todoInput = document.querySelector(".todo-input");
const todoButton = document.querySelector(".todo-button");
const todoList = document.querySelector(".todo-elem");
const filteropt = document.querySelector('.filter');

//Event Listners
todoButton.addEventListener("click", addTodo);
todoList.addEventListener('click', deleteCheck);
filteropt.addEventListener('click', filterTodo);


//Functions
function addTodo(e){
    e.preventDefault();

    const todoDiv=document.createElement("div");
    todoDiv.classList.add("todo");
    savaTodo(todoInput.value)

    const newTodo= document.createElement("li");
    newTodo.innerText=todoInput.value;
    todoInput.value=""
    newTodo.classList.add("todo-item");
    todoDiv.appendChild(newTodo);


    const completeButton=document.createElement("button");
    completeButton.innerHTML='<i class="fas fa-check"></i>';
    completeButton.classList.add("complete-btn");
    todoDiv.appendChild(completeButton);
    
    const trashButton=document.createElement("button");
    trashButton.innerHTML=`<i class="far fa-trash-alt"></i>`;
    trashButton.classList.add("trash-btn");
    todoDiv.appendChild(trashButton);

    todoList.appendChild(todoDiv); 
}

function deleteCheck(e){
    console.log(e.target);
    const item=e.target;
    if(item.classList[0]==='trash-btn'){
        const todo=item.parentElement;
        todo.classList.add("out");
        todo.addEventListener('transitionend', function(){
            todo.remove();
        });
    }
    if(item.classList[0]==='complete-btn'){
        const todo=item.parentElement;
        todo.classList.toggle('completed');
        
    }
}

function filterTodo(e){
    const todos=todoList.childNodes;
    
    todos.forEach(function(todo){
        switch(e.target.value){
            case "all":
                todo.style.display="flex";
                break;
            case "completed":
                if(todo.classList.contains('completed')){
                    todo.style.display="flex";
                }
                else{
                    todo.style.display="none";
                }
                break;
            case "uncompleted":
                if(!todo.classList.contains("completed")){
                    todo.style.display='flex'
                }
                else{
                    todo.style.display="none";
                }
                break;

            }
    })
}

function savaTodo(todo){
    let todos;
    if(localStorage.getItem("todos")===null){
        todos=[];
    }
    else{
        todos=JSON.parse(localStorage.getItem("todos"));
    }
    todos.push(todo);
    localStorage.setItem("todos", JSON.stringify(todos))
}