let level1Score = []

function addScore(scores,newScore){

    scores.push(newScore);
    return scores;
}

let removeScore = function (scores,scoreToRemove){

    index = scores.indexOf(scoreToRemove);

    scores.splice(index,1);
    return scores;
}

isHighScore = (scores,score)=>{

     return scores.every(el=>el<=score);
}

function calculateTotalScore(scores){

    return scores.reduce((sum,el)=>sum+el);
}

function applyBonus(scores,bonus=5){

    bonus = scores.map(el=>el+bonus);
    return bonus;
}

function addMultipleScores(scores,...score){

    scores.push(...score);
}

addScore(level1Score,90);
addScore(level1Score,100);
addScore(level1Score,110);

console.log(level1Score);

console.log(isHighScore(level1Score,110));


console.log(calculateTotalScore(level1Score));

console.log(applyBonus(level1Score,10));