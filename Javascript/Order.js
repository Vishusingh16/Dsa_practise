let stocks = {
    Fruits: ["strawberry", "grapes", "banana", "apple"],
    liquid: ["water", "ice"],
    holder: ["cone", "cup", "stick"],
    toppings: ["chocolate", "peanuts"],
}

setTimeout(() => { }, 1000)

let order = (fruit_name, call_production) => {
    setTimeout(function () {
        console.log(`${stocks.Fruits[fruit_name]} was selected`)
        call_production()
    }, 2000)
};
let production = () => {
    setTimeout(() => {
        console.log("Production has been started")
        setTimeout(() => {
            console.log("The Fruits has been chopped")
            setTimeout(() => {
                console.log(`${stocks.liquid[0]}and${stocks.liquid[1]}Added`)
                setTimeout(() => {
                    console.log("Start the machine ")
                    setTimeout(() => {
                        console.log(`Ice cream placed on ${stocks.holder[1]}`)
                        setTimeout(() => {
                            console.log(`${stocks.toppings[0]}is added as toppings`)
                            setTimeout(() => {
                                console.log("serve Ice cream")
                            }, 2000)
                        }, 3000)


                    }, 2000)

                }, 1000)
            }, 1000)

        }, 2000)


    },)

};

//Trigger 
order(0, production);
