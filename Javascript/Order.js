let stocks={
    Fruits : ["strawberry", "grapes", "banana", "apple"],
    liquid : ["water", "ice"],
    holder : ["cone", "cup", "stick"],
    toppings : ["chocolate", "peanuts"],
}

setTimeout(()=>{},1000)

let order =(fruit_name, call_production )=>{
    setTimeout(function(){
        console.log(`${stocks.Fruits[fruit_name]} was selected`)
        call_production()
    },2000)
};
let production=()=>{

};

//Trigger 
order(0, production);
console.log("hi")