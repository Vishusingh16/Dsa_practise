// .then works when a promise is resolved
// .catch works when a promise is rejected


let is_shop_open = false

.catch(()=>{
    console.log("Customer left")

})

.finally (()=>{
 console.log("end of the day")   
})


// async await 

function order (){
    return new Promise((resolve, reject )=>{

        if(true){
            resolve("promise is fulfilled")
        }else{
            reject("error is there")
        }

    })
}
async function(Kitchen){
    try{
        await  abc;

    }
    catch(error){
        console.log("abc doen;t exit ", error)
    }
    finally{
        console.log("Runs code anyways")
    }
}
Kitchen();
