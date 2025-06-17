books = [];

var input = prompt('which operation u want to perform-add, list');

while(input!='exit'){

    if(input=='add'){

        newBook = prompt("Enter book name");
        books.push(newBook);
    } else if(input=='list'){

        console.log("available books are")
        console.log(books)
    }else if(input=='remove'){

        books.pop();
    }
     else{

        console.log("Invalid option");
    }

    input =  prompt('which operation u want to perform-add, list');
}