str = prompt("enter string");

left = 0;
right = str.length-1;
flag = 0;
while(left<right){

    if(str[left]!=str[right]){

        flag = 1
        break;
    }

    left++;
    right--;
}

if(flag==1){

    console.log("not palindrome");
} else{

    console.log("palindrome");
}