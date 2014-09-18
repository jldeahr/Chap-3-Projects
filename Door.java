

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door
{
    /** description of instance variable x (add comment for each instance variable) */
    private String name = "front";
    private String access = "open";
    
    /**
     * Default constructor for objects of class Door
     */
    public Door(String name, String access)
    {
        // initialise instance variables
        this.access = access;
        this.name = name;
       
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public String open()
    {
        // put your code here
        return access = "open";
    }
    public String close()
    {
        return access = "close"; 
    }
    public String getName()
    {
        return this.name;
    }
    public String getAccess()
    {
        return this.access;
    }
}
