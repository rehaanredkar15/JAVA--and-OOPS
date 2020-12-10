class loan
{
  private int adharno;
  private int pan;
  private String address;
  private int mobile;
  private int accno;
  private String name;
  private String city;
  
  public void setdata(int an,int pn,String add,int mb,int ano,String nm,String ct)
  {
      adharno = an;
	  pan = pn;
	  address = add;
	  mobile = mb;
	  accno = ano;
	  name = nm;
	  city = ct;
	  
  
    }
	public void showdata()
	{
       System.out.println("the adhar no is " +adharno);
       System.out.println("the pan no is " +pan);
       System.out.println("the adress is " +address);
       System.out.println("the mobile no is " +mobile);
       System.out.println("the account no is " +accno);
       System.out.println("the name is " +name);
       System.out.println("the city is " +city);
	
	}
}

class homeloan extends loan
{
	private String typeofproperty;
	private String typeofowner;
	private String ownername;
	private double carpetarea;
	private double builduparea;
	private double rateperqsquareft;
	private String addressofproperty;
	private int price;
	private int loanamt;
	private double roi;
	private int duration;
	
	public void setdata(int an,int pn,String add,int mb,int ano,String nm,String ct,String top,String too,String on,double ca,double ba,double rate,String ap,int p,int lm,double ro,int du)
	{
		super.setdata(an,pn,add,mb,ano,nm,ct);
		typeofproperty=top;
	    typeofowner=too;
	    ownername=on;
		carpetarea = ca;
		builduparea = ba;
		rateperqsquareft = rate;
		addressofproperty = ap;
		price = p;
		loanamt = lm;
		roi = ro;
		duration =du;

     }
	public void showdata()
	{
	   super.showdata();
       System.out.println("typeofproperty"+typeofproperty);
       System.out.println("typeofowner"+typeofowner);
       System.out.println(" ownername"+ownername);
       System.out.println("carpetarea "+carpetarea);
       System.out.println("builduparea" +builduparea);
       System.out.println("rateperqsquareft "+ rateperqsquareft);
       System.out.println("addressofproperty" + addressofproperty);
       System.out.println("price "+ price);
       System.out.println("loanamt"+loanamt);
       System.out.println("roi "+ roi);
       System.out.println("duration "+duration);
	
	}
	
	public void downpayment()
	{
		
		int z = price - loanamt;
	System.out.println("downpayment"+z);
	}
	
	public void emi()
	{
		double EMI = (loanamt+(loanamt+roi)*duration)/(duration*12);
		System.out.println("EMI"+EMI);
	}
}
	
class goldloan extends loan
{
	private double weight;
	private String description;
	private int  purity;
	private String goldsmithname;
	private String adressofGS;
	private int cost;
	private int loanamt;
	private int duration;
	private double roi;
	
	public void setdata(int an,int pn,String add,int mb,int ano,String nm,String ct,double wg,String des,int pu,String gsnm,String gsadd,int co,int lamt,int du,double r)
	 {
		super.setdata(an,pn,add,mb,ano,nm,ct);
		weight = wg;
		description = des;
		purity = pu;
		goldsmithname = gsnm;
		adressofGS = gsadd;
		cost = co;
		loanamt = lamt;
		duration = du;
		roi = r;
	 }
	 
	 public void  showdata()
	 {
		 super.showdata();
		 System.out.println("Weight of gold "+weight);
		 System.out.println("Gold material "+description);
		 System.out.println("purity of gold "+purity);
		 System.out.println("Name of goldsmithname "+goldsmithname);
		 System.out.println("address of goldsmithname "+adressofGS);
		 System.out.println("cost "+cost);
		 System.out.println("loan amount "+loanamt);
		 System.out.println("duration "+duration);
		 System.out.println("Rate of Interest "+roi);
		 
	 }
	 
	 public void settlement()
	 {
		 double settlement = loanamt+(loanamt*roi)*duration;
		 System.out.println("Settlement amount =" +settlement);
		
	 }
		
}


class carloan extends loan
{
	private String cname;
	private String modelname;
	private String color;
	private String fueltype;
	private int engineno;
	private int cc;
	private int seatcapacity;
	private int rtocharge;
	private int insurance;
	private int loanamt;
	private double roi;
	private int  duration;
	private int downpayment;
	
	public void setdata(int an,int pn,String add,int mb,int ano,String nm,String ct,String cn,String mn,String clr,String ft,int en,int c,int rc,int sc,int in,int lamt,double r,int du,int dp)
	 {
		super.setdata(an,pn,add,mb,ano,nm,ct);
		cname = cn;
		modelname = mn;
		color = clr;
		fueltype = ft;
		engineno=en;
		cc = c;
		seatcapacity=sc;
		rtocharge = rc; 
		insurance= in;
	    loanamt = lamt;
		duration = du;
		roi = r;
		downpayment = dp;
	}
	
	
	public void  showdata()
	 {
		 super.showdata();
		 System.out.println("Company name = "+cname);
		System.out.println("Model name = "+modelname);
		System.out.println("Color of car = "+color);
		System.out.println("Type of fuel = "+fueltype);
		System.out.println("Engine number = "+engineno);
		System.out.println("CC = "+cc);
		System.out.println("Seat capacity = "+seatcapacity);
		System.out.println("RTO Charges = "+rtocharge);
		System.out.println("Insurance = "+insurance);
		System.out.println("Loan amount = "+loanamt);
		System.out.println("Rate of intrest = "+roi);
		System.out.println("Downpayment = "+downpayment);
	 }
	 
	 public void onroadprice()
	 {
		 int rp = downpayment + loanamt;
		 
		 System.out.println("on road price is "+rp);
		 
	 }
	 
	 public void emi()
	 {
		 
		 double emi = (loanamt + (loanamt*roi)*duration)/duration*12;
		 System.out.println("emi "+emi);
		 
	 }
}

class education extends loan
{
	private String typeofdegree;
	private String nameofdegree;
	private String clgname;
	private String payblename;
	private String univeristyname;
	private String parentdetails;
	private int durationofdegree;
	private int loanamt;
	private int refundduration;
	private int parentincome;
	private double roi;
	
     public void setdata(int an,int pn,String add,int mb,int ano,String nm,String ct,String degreet,String degreenm,String clgnm,String uniname,int degreedur,int lamt,String paynm,int refunddr,int rateofroi,String pdetails,int pincome)
	 {
		super.setdata(an,pn,add,mb,ano,nm,ct);
	    typeofdegree = degreet;
		nameofdegree = degreenm;
		clgname = clgnm;
		univeristyname = uniname;
		durationofdegree = degreedur;
		loanamt = lamt;
		payblename = paynm;
		refundduration = refunddr;
		roi = rateofroi;
		parentdetails = pdetails;
		parentincome = pincome;
     }	
	 
	public void  showdata()
	 {
		 super.showdata();
		 System.out.println("Typeofdegree "+typeofdegree);
		 System.out.println("Name of degree "+ nameofdegree);
		 System.out.println("collegname "+clgname);
		 System.out.println("Name of university "+ uniname);
		 System.out.println("duration of degree "+ degreedur);
		 System.out.println("loan amount"+loanamt);
		 System.out.println("payable name"+payablename);
		 System.out.println("refund duration"+ refunddr);
		 System.out.println("rate of interest"+ roi);
		 System.out.println("=parentdetails "+parentdetails);
		 System.out.println("parent income "+ parentincome);
		 System.out.println("Rate of Interest "+roi);
	 }
	 
	 public void emi()
	 {
		 
		  double emi = (loanamt + (loanamt*roi)*refundduration)/refundduration*12;
		 System.out.println("emi "+emi);
	 }
}


class agriculturelaon extends loan
{
	private int gutno;
	private int  areahect;
	private int duration;
	private int loanamt;
	private String typeofland;
	private String pikdetails;
	private String areanm;
	private double roi;
	
	public void setdata(int an,int pn,String add,int mb,int ano,String nm,String ct,int gutno,String anm,int hect,String ltypes,int lamt,String pdetails,double roi,int dur)
	{
		super.setdata(an,pn,add,mb,ano,nm,ct);
		gutno = gno;
		areanm = anm;
		areahect = hect;
		typeofland = ltypes;
		pikdetails = pdetails;
		loanamt = lamt;
		roi = rateoi;
		duration = dur;
		
	}
		
	public void showdata()
	{
		super.showdata();
		System.out.println("Gut number: "+gutno);
		System.out.println("Name of area: "+areanm);
		System.out.println("Area in hector: "+areahect);
		System.out.println("type of land: "+typeofland);
		System.out.println("pikpani details: "+pikdetails);
		System.out.println("loan amount : "+loanamt);
		System.out.println("Rate of interest: "+roi);
		System.out.println("duration: "+duration);
	}
	
	public void settlement()
	{
		double settlement = loanamt+(loanamt*roi)*duration;
		System.out.println("settlement amount "+settlement);
	}
		
}
	
class personalloan extends loan
{
	private String companynm;
	private String companytype;
	private String companyaddress;
	private String post;
	private String currentaddress;
	private int contact;
	private int salary;
	private int experience;
	private int cibilscore;
	private int loanfee;
	private int loanamount;
	private int duration;
	private double roi;
	
	public void setdata(int an,int pn,String add,int mb,int ano,String nm,String ct,String cnm,String ctype,String companyadd,String pt,String cadd,int call,int sal,int exp,int cibil,int lfee,int lmt,int dur,double roi)
	{
		super.setdata(an,pn,add,mb,ano,nm,ct);
	    companynm = cnm;
      	companytype = ctype;
		companyaddress = companyadd;
		post = pt;
		currentaddress = cadd;
		contact = call;
		salary = sal;
		experience = exp;
		cibilscore = cibil;
		loanfee = lfee;
	    loanamount = lmt;
		duration = dur;
		roi = rateoi;
	}
		
	public void showdata()
	{
		super.showdata();
		 System.out.println("Company name = "+companynm);
		System.out.println("Type of Company = "+companytype);
		System.out.println("Address of company = "+companyaddress);
		System.out.println("Contact  = "+contact);
		System.out.println("Post in company = "+post);
		System.out.println("experiance = "+experiance);
		System.out.println("Salary = "+salary);
		System.out.println("Cibil Score = "+cibilscore);
		System.out.println("Current Address = "+currentaddress);
		System.out.println("Loan processing fee = "+loanfee);
		System.out.println("Loan amount = "+loanamt);
		System.out.println("Rate of intrest = "+roi);
		System.out.println("Duration = "+duration);
	}
	public void emi()
	{
		double emi = (loanamountt+(loanamount*roi)*duration)/duration*12;
		System.out.println("emi "+emi);
	}
	
	public void inhandant()
	{
		int inhand = loanamount - loanfee;
        System.out.println("In hand amount "+inhand); 	 
		
	}
	
	
	
	
	
}

class buisnessloan extends loan
{
	private String buisnessname;
	private String buisnesstype;
	private String ownertype;
	private String ownername;
	private String buisnessaddress;
	private int capital;
	private int shares;
	private int loanamt;
	private int duration;
	private int registrationno;
	private double roi;
	
	public void setdata(int an,int pn,String add,int mb,int ano,String nm,String ct,String bnm,String btype,String otype,int sh,String ownernm,String baddress,String  pro,int cap,int lmt,int dur,double roi,int ragistno)
	{
		super.setdata(an,pn,add,mb,ano,nm,ct);
		buisnessname = bnm;
		buisnesstype = btype;
		ownertype = otype;
		shares = sh;
		ownername = ownernm;
		buisnessaddress = baddress;
		product = pro;
		capital = cap;
		loanamt = lmt;
		roi = rateoi;
		duration = dur;
		registrationno = ragist;
	}
	public void showdata()
	{
		super.showdata();
        System.out.println("Business name = "+businessname);
		System.out.println("Type of business = "+businesstype);
		System.out.println("Type of owner = "+ownertype);
		System.out.println("shares = "+shares);
		System.out.println("Name of owner = "+ownername);
		System.out.println("Business address = "+businessaddress);
		System.out.println("product = "+product);
		System.out.println("Capital amount = "+capital);
		System.out.println("Loan amount = "+loanamt);
		System.out.println("Rate of intrest = "+roi);
		System.out.println("Duration = "+duration);
		System.out.println("Ragistration number = "+ragistrationno);

		
	}
	
	public void totalaccect()
	{
		int total = loanamt + capital;
		System.out.println("total Accet "+ total);
	}
	public void emi()
	{
		double emi = (loanamt+(loanamt*roi)*duration)/duration*12;
		System.out.println("emi "+ emi);

	}
		
		
	}
	
	
	class end
	{
		public static void main(String[] Args)
		{
		  homeloan h1;
		   h1 =new homeloan();
		   h1.setdata 
		    h1.showdata();
			h1.downpayment();
			h1.emi();
			
			
	    System.out.println();
		
		goldloan g;
		g =new goldloan();
		g.setdata(3652,32,"devkar panand",9165,1410,"rehan","kolhapur",300,"earinings",22,"redkar ","devkarpanand",268200,300000,15,0.10);
		g.showdata();
		g.settlement();
		
		System.out.println();
		
		 carloan c;
		 c1 = new carloan();
		 c.setdata 
	     c.onroadprice();
		 c.emi();
		 
		 System.out.println();
		 
		 educationloan e;
		 e = new eduacationloan();
		 e.setdat(3652,32,"devkar panand",9165,1410,"rehan","kolhapur","postgd","btech","dypsn","suk",4,200000,2000,"rehan",10,0.10,"emplyoee",30000);
		 e.showdata();
		 e.emi();
		 
		  System.out.println();
		  
		  
		  agriculturelaon a;
		  a = new agriculturelaon();
		  a.setdata(3652,32,"devkar panand",9165,1410,"rehan","kolhapur",7,"devkar panand",10,"farming",300000,"rice",0.10,6);
		  a.showdata();
		  a.settlement();
		  
		  System.out.println();
		  
		  
		  personalloan p;
		  p = new personalloan();
		  p.showdata
		  p.showdata();
		  p.emi();
		  p.inhandant();
		  
		  System.out.println();
		  
		  
		  buisnessloan b;
		  b=new buisnessloan();
		  b.setdata(3652,32,"devkar panand",9165,1410,"rehan","kolhapur","Tuttion","self-employed",80,"sakshi","devkar panand","kp",36500,520000,7,0.10,90);
		  b.totalaccect();
		  b.emi();
		 }
		
	
	
	}