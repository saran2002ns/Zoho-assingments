let sum=0;
function addToList(event){
    event.preventDefault()

    const category=document.getElementById("category").value;
    const amount=document.getElementById("amount").value;
    const date=document.getElementById("date").value;
    if(amount.trim()==="" || date.trim()===""||category.trim()===""){
        alert("Please fill the Details");
        return;
    }
    let expenseItem = document.createElement("div");
    expenseItem.classList.add("li");
    expenseItem.innerHTML = `
        <p>${category}</p>
        <p id="amount">$${amount}</p>
        <p >${date}</p>
        <button onclick="remove(event)">Delete</button>
    `;
    sum+=Number(amount);
    let ul=document.getElementById("list");
    ul.append(expenseItem);

    let a=document.getElementById("total-expensive");
    a.textContent="Total Expensive : "+sum;


}

function remove(event){
   event.target.parentElement.remove();
}