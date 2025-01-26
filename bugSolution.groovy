def myMethod(a,b){
  if(a instanceof String || b instanceof String){
    return "Please provide numerical inputs"
  }
  if(a>b){
    return a
  }else{
    return b
  }
}
println myMethod(10,2)
println myMethod(10,"2")
println myMethod("10",2)