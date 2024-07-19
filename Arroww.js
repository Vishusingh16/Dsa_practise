document.addEventListener('DOMContentLoaded',()=>{
    document.querySelector('buttom').forEach(
button=>{
button.onClick=()=>{
    document.querySelector('#button').style.color=button.dataset.color;
}}
)});

var count=0;
 counter=()=>{
    count++;
    document.querySelector('h1').innerHTML=count;

    if(count%10===0){
        alert(`Count is now ${count}`);

    }
  
}
document.addEventListener('DOMContentLoaded',()=>{
    document.querySelector('button').onclick= counter;
    // document.querySelector('button').addEventListener(click, counter);
});