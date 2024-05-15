
// var arr = [12,3,4,5,6,7,8];
// arr.unshift(0);
// arr.shift();
// arr.splice(1,2);


// const user={
//     username :"vaishnav",
//     age:24,
//     phonenumber:89223-454,

// getuserdetail:function(){
//     console.log("got user detais")
//     console.log(`username:${this.username}`)
//     console.log(this)
// }

// }


// console.log(user.username)
// console.log(user.getuserdetail)
// // console.log(this)


function User(username, loggedin, age){
    this.username=username;
    this.loggedIn=loggedin;
    this.age=age;
}
const userOne= new User("vaishnav",true,12);
const userTwo = new User("Himanshu",false,293);


console.log(userOne);
