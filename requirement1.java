System.out.println(seeRequirement1());

private static String seeRequirement1() {
    String requirement []  = {" %ptD%ptev%pte%ptlo%ptper ", "kcatslluF", "(%T0J%T0av%T0a-%T0B%T0oo%T0t)-%T0Sp%T0ri%T0ng", "JobCode-MK0003"};

   String role =  new StringBuilder(requirement[1]).reverse()
					.append(requirement[0].replaceAll("%pt", "")).toString();

	String[] skills = requirement[2].replaceAll("%T0", "").split("-");

    return role + skills[0]+"/"+skills[2]+skills[1]+": "+requirement[3];
}

