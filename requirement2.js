console.log(seeRequirement2());

function seeRequirement2() {
    var requirement  = [' %ptD%ptev%pte%ptlo%ptper', 'ctJs%Rea',  '%T0R%T0ea%T0ct-%T0 Na%T0ti%T0ve', 'JobCode-MK004'];

    var role =  requirement[0].replaceAll('%pt', '');
    var skill1 =  requirement[1].split('%').reverse();

    var skill2 = requirement[2].replaceAll('%T0', '').split('-');

    return skill1[0]+skill1[1] + ' + '+ skill2[0]+skill2[1]+role+': '+requirement[3];
}