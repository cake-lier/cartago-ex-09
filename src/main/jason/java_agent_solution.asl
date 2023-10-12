!java_agent.

+!java_agent : true <-
    cartago.new_obj("io.github.cakelier.Counter", [], Counter1Id);
    cartago.invoke_obj(Counter1Id, increment(5));
    cartago.invoke_obj(Counter1Id, getCount, Count1);
    println("The count is now ", Count1);
    cartago.new_obj("io.github.cakelier.Counter", [10], Counter2Id);
    cartago.invoke_obj(Counter2Id, increment(5));
    cartago.invoke_obj(Counter2Id, getCount, Count2);
    println("The count is now ", Count2);
    cartago.invoke_obj("io.github.cakelier.Counter", getClassName, ClassName);
    println("The class name is ", ClassName).

{ include("$jacamoJar/templates/common-cartago.asl") }
