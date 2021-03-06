package com.practice;

public class Test18 {
//final is only about the reference that is marked by it; there is no such thing as an immutable array in Java. When you say
	private static final int[] xs = new int[20];
	//xs=new int[10]; you won't be allowed to say.
	/*
	 * Here you are making a object reference final, not a primitive. (Arrays are special Java objects, too.) Making a reference final means that you cannot make it refer something else once it is initialized. But of course you can change the state of an object referred by a final variable.
	 * final means you can't change the reference - ie you can't assign another array to that field.

"Immutable" means you can't change the contents of the array - final has no effect on that.

	*/
	//mvn -Djar.finalName=myCustomName ... we can change final name and mvn jar:jar -Djar.finalName=custom-jar-name
	//<build>	  <finalName>app-1.0-SNAPSHOT</finalName>
	//<dependencyManagement> allows to consolidate all dependencies (used at child pom level) used across different modules -- clarity, central dependency version management
	//<dependencyManagement> allows to easily upgrade/downgrade dependencies based on need, in other scenario this needs to be exercised at every child pom level -- consistency
	//dependencies provided in <dependencies> tag is always imported, while dependencies provided at <dependencyManagement> in parent pom will be imported only if child pom has respective entry in its <dependencies> tag.
	//repository is used for fetch jar from particular url
	/*
	 * EnableAutoConfiguration annotation tells Spring Boot to "guess" how you will want to configure Spring, based on the jar dependencies that you have added. For example, If HSQLDB is on your classpath, and you have not manually configured any database connection beans, then Spring will auto-configure an in-memory database.

@ComponentScan tells Spring to look for other components, configurations, and services in the specified package. Spring is able to auto scan, detect and register your beans or components from pre-defined project package. If no package is specified current class package is taken as the root package.sky
	 */
	public static void main(String[] args) {

	}

	
}
