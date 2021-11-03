const recKeySetCount = 8;

console.log("Recovery Key : " + generateBLRecKey());


function generateBLRecKey(){
    let recKey = "";

    for(let i = 0; i< recKeySetCount; i++){
        if(i<7)
            recKey += random16BitNumGenerator() + "-";
        else
            recKey += random16BitNumGenerator();
    }

    return recKey;
}

function random16BitNumGenerator(){
    let temp = "";
    let interim16Bit = (Math.trunc(Math.random() * 65535) * 11).toString();
    if(interim16Bit.length < 6){
        for(let i = 0; i <(6-interim16Bit.length);i++){
            temp += "0";
        }
        interim16Bit = temp + interim16Bit;
    }
    return interim16Bit;
}