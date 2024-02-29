package Feedback;

public class feedbackInsert {
	
	private int id;
    private String name;
    private String EEmail;
    private int rate;
    private String comments;
    private int ffid;
    
    
    public feedbackInsert(int id, String name, String Email, int rate, String comments,int ffid) 
    {
	this.id = id;
	this.name = name;
	this.EEmail = EEmail;
	this.rate = rate;
	this.comments = comments;
	this.ffid=ffid;

	
    }

    

	public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEEmail() {
        return EEmail;
    }

    public int getRate() {
        return rate;
    }

    public String getcomments() {
        return comments;
    }
 
    public int getFfid() {
        return ffid;
    }


      
}


