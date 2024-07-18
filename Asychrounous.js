let stocks={
    Fruits : ["strawberry", "grapes", "banana", "apple"],
    liquid : ["water", "ice"],
    holder : ["cone", "cup", "stick"],
    toppings : ["chocolate", "peanuts"],
}

// function 1
let order=(fruit_name,call_production)=>{
    console.log("Order placed,Please call the production")

    call_production()
};
// function 2

let production=()=>{
    console.log("Production has started")

};

// trigger 
order("",production)
