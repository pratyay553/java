


let arr =[1,4,7,2,56,78,4, -2,-1,7,-9]

console.log(arr.sort((a,b)=> b-a))


const checkNumber= (arr)=>{
  const sortnums= arr.sort((a,b)=> b-a)
  let res =[];
  let backIndex = sortnums.length-1;
  
  for(let i=0; i<sortnums.length; i++){
    if(i=== backIndex){
      res.push(sortnums[i])
      console.log(res)
      return res
    }

    if(sortnums[i] >0){
      res.push(sortnums[i])
      if(sortnums[backIndex] <0){
        res.push(sortnums[backIndex])
        backIndex -= 1
      }

    }else{
      res.push(sortnums[backIndex])
      backIndex -= 1
    }
  }
}

checkNumber(arr)