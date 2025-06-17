let nakul = [];

let trending = ['tum hi ho','aadat','bewajah'];

let duration = [5,6,3,4,6];

function addToPlaylist(playlist,songName){

    playlist.push(songName);
    return playlist;
}

deleteFromPlaylist =  function (playlist,songName){

    index = playlist.indexOf(songName);

    playlist.splice(index,1);

    return playlist;
}

let isTrending = songName =>{

    return trending.includes(songName);

}

function calculateDuration(durations,speed = 1){

    return Math.floor(durations/speed);
}

function addBulkSongs(playlist,...songNames){

    playlist.push(...songNames);

    return playlist;
}


console.log(addToPlaylist(nakul,"kabira"));
console.log(addToPlaylist(nakul,"ishq tera"));
console.log(addToPlaylist(nakul,"malang sajna"));

console.log(deleteFromPlaylist(nakul,"kabira"));

console.log(isTrending("aadat"));

console.log(calculateDuration(6,2));

console.log(addBulkSongs(nakul,"raabta",'pehla pyar','satranga'));