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
		adharno=an;
		pan=pn;
		address=add;
		mobile=mb;
		accno=ano;
		name=nm;
		city=ct;
	}
	public void showdata()
	{
		System.out.println("Adhar number is "+adharno);
		System.out.println("Pan number is "+pan);
		System.out.println("Address is "+address);
		System.out.println("Mobile number is "+mobile);
		System.out.println("Account number is "+accno);
	}
}

class homeloan extends loan
{
	private String typeofproperty;
	private String typeofowner;
	private String ownername;
	private double carpetarea;
	private double builduparea;
	private double ratepersqft;
	private String addressofproperty;
	private int price;
	private int loanamt;
	private double roi;
	private int duration;

	public void setdata(int an,int pn,String add,int mb,int ano,String nm,String ct,String top,String too,String on,double cptarea,double barea,double rate,String addd,int p,int lamt,double rateoi,int dur)
	{
		super.setdata(an,pn,add,mb,ano,nm,ct);
		typeofproperty=top;
		typeofowner=too;
		ownername=on;
		carpetarea=cptarea;
		builduparea=barea;
		ratepersqft=rate;
		addressofproperty=addd;
		price=p;
		loanamt=lamt;
		roi=rateoi;
		duration=dur;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("Type of property = "+typeofproperty);
		System.out.println("Type of owner = "+typeofowner);
		System.out.println("Name of owner = "+ownername);
		System.out.println("Carpet area per = "+carpetarea+" sq.ft");
		System.out.println("Buildup area per = "+builduparea+" sq.ft");
		System.out.println("Rate per sq.ft = "+ratepersqft+" sq.ft");
		System.out.println("Address of property = "+addressofproperty);
		System.out.println("price = "+price);
		System.out.println("loan amount = "+loanamt);
		System.out.println("Rate of intrest = "+roi);
		System.out.println("Duration = "+duration);
	}
	public void downpayment()
	{
		int z= price-loanamt;
		System.out.println("Downpayment = "+z);
	}
	public void emi()
	{
		double EMI=(loanamt+(loanamt*roi)*duration)/(duration*12);
		System.out.println("EMI = "+EMI);
	}
}
class goldloan extends loan
{
	private double weight;
	private String discription;
	private int purity;
	private String goldsmithname;
	private String addressofGS;
	private int cost;
	private int loanamt;
	private int duration;
	private double roi;

	public void setdata(int an,int pn,String add,int mb,int ano,String nm,String ct,double wt,String dis,int pur,String gsnm,String gsadd,int cst,int lamt,int dur,double rateoi)
	{
		super.setdata(an,pn,add,mb,ano,nm,ct);
		weight=wt;
		discription=dis;
		purity=pur;
		goldsmithname=gsnm;
		addressofGS=gsadd;
		cost=cst;
		loanamt=lamt;
		duration=dur;
		roi=rateoi;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("Weight of gold = "+weight);
		System.out.println("Gold material = "+discription);
		System.out.println("Purity of gold = "+purity+" carret");
		System.out.println("Name of gold smith = "+goldsmithname);
		System.out.println("Address of gold smith = "+addressofGS);
		System.out.println("Cost = "+cost);
		System.out.println("Loan amount = "+loanamt);
		System.out.println("Duration = "+duration);
		System.out.println("Rate of intrest = "+roi);
	}
	public void settlement()
	{
		double settlement=loanamt+(loanamt*roi)*duration;
		System.out.println("Settlement amount = "+settlement);
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
	private int duration;
	private int downpayment;

	public void setdata(int an,int pn,String add,int mb,int ano,String nm,String ct,String cnm,String mname,String col,String ftype,int eno,int c,int scapacity,int rtoc,int i,int lamt,int dur,double rateoi,int dpay)
	{
		super.setdata(an,pn,add,mb,ano,nm,ct);
		cname=cnm;
		modelname=mname;
		color=col;
		fueltype=ftype;
		engineno=eno;
		cc=c;
		seatcapacity=scapacity;
		rtocharge=rtoc;
		insurance=i;
		loanamt=lamt;
		duration=dur;
		roi=rateoi;
		downpayment=dpay;
	}
	public void showdata()
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
		System.out.println("On road price = "+rp);
	}
	public void emi()
	{
		double emi=(loanamt+(loanamt*roi)*duration)/duration*12;
		System.out.println("EMI = "+emi);
	}
}

class education extends loan
{
	private String typeofdegree;
	private String nameofdegree;
	private String clgname;
	private String universityname;
	private int durationofdegree;
	private int loanamt;
	private String payblename;
	private int refundduration;
	private double roi;
	private String parentdetails;
	private int parentincome;

	public void setdata(int an,int pn,String add,int mb,int ano,String nm,String ct,String degreet,String degreenm,String clgnm,String uniname,int degreedur,int lamt,String payname,int refunddur,double rateoi,String pdetails,int pincome)
	{
		super.setdata(an,pn,add,mb,ano,nm,ct);
		typeofdegree=degreet;
		nameofdegree=degreenm;
		clgname=clgnm;
		universityname=uniname;
		durationofdegree=degreedur;
		loanamt=lamt;
		payblename=payname;
		refundduration=refunddur;
		roi=rateoi;
		parentdetails=pdetails;
		parentincome=pincome;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("Type of degree = "+typeofdegree);
		System.out.println("Name of degree = "+nameofdegree);
		System.out.println("clgname = "+clgname);
		System.out.println("Name of University = "+universityname);
		System.out.println("Duration of degree = "+durationofdegree);
		System.out.println("Loan amount = "+loanamt);
		System.out.println("Payble name = "+payblename);
		System.out.println("Refund duration = "+refundduration);
		System.out.println("Rate of intrest = "+roi);
		System.out.println("Parent details = "+parentdetails);
		System.out.println("Parent income = "+parentincome);
	}
	public void emi()
	{
		double emi=(loanamt+(loanamt*roi)*refundduration)/refundduration*12;
		System.out.println("EMI = "+emi);
	}
}

class agricultureloan extends loan
{
	private int gutno;
	private String areanm;
	private int areahect;
	private String typeofland;
	private String pikdetails;
	private int loanamt;
	private double roi;
	private int duration;

	public void setdata(int an,int pn,String add,int mb,int ano,String nm,String ct,int gno,String anm,int hect,String ltype,String pik,int lamt,double rateoi,int dur)
	{
		super.setdata(an,pn,add,mb,ano,nm,ct);
		gutno=gno;
		areanm=anm;
		areahect=hect;
		typeofland=ltype;
		pikdetails=pik;
		loanamt=lamt;
		roi=rateoi;
		duration=dur;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("Gut number = "+gutno);
		System.out.println("Name of area = "+areanm);
		System.out.println("Area in hecter = "+areahect);
		System.out.println("Type of land = "+typeofland);
		System.out.println("Pik Pani details = "+pikdetails);
		System.out.println("Loan amount = "+loanamt);
		System.out.println("Rate of intrest = "+roi);
		System.out.println("duration = "+duration);
	}

	public void settlementamt()
	{
		double settlement=loanamt+(loanamt*roi)*duration;
		System.out.println("Settlement amount = "+settlement);
	}
}

class personalloan extends loan
{
	private String companynm;
	private String companytype;
	private String companyaddress;
	private int contact;
	private String post;
	private int experiance;
	private int salary;
	private int cibilscore;
	private String currentaddress;
	private int loanfee;
	private int loanamt;
	private double roi;
	private int duration;

	public void setdata(int an,int pn,String add,int mb,int ano,String nm,String ct,String cnm,String ctype,String companyadd,int call,String pt,int exp,int sal,int cibil,String cadd,int lfee,int lamt,double rateoi,int dur) 
	{
		super.setdata(an,pn,add,mb,ano,nm,ct);
		companynm=cnm;
		companytype=ctype;
		companyaddress=companyadd;
		contact=call;
		post=pt;
		experiance=exp;
		salary=sal;
		cibilscore=cibil;
		currentaddress=cadd;
		loanfee=lfee;
		loanamt=lamt;
		roi=rateoi;
		duration=dur;
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
		double emi=(loanamt+(loanamt*roi)*duration)/duration*12;
		System.out.println("EMI = "+emi);
	}
	public void inhandamt()
	{
		int inhand = loanamt - loanfee ;
		System.out.println("In hand amount = "+inhand);
	}
}

class businessloan extends loan
{
	private String businessname;
	private String businesstype;
	private String ownertype;
	private int shares;
	private String ownername;
	private String businessaddress;
	private String product;
	private int capital;
	private int loanamt;
	private double roi;
	private int duration;
	private int ragistrationno;

	public void setdata(int an,int pn,String add,int mb,int ano,String nm,String ct,String bnm,String btype,String otype,int sh,String ownernm,String baddress,String pro,int cap,int lamt,double rateoi,int dur,int ragist)
	{
		super.setdata(an,pn,add,mb,ano,nm,ct);
		businessname=bnm;
		businesstype=btype;
		ownertype=otype;
		shares=sh;
		ownername=ownernm;
		businessaddress=baddress;
		product=pro;
		capital=cap;
		loanamt=lamt;
		roi=rateoi;
		duration=dur;
		ragistrationno=ragist;
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
		int total = loanamt + capital ;
		System.out.println("Total Accect = "+total);
	}
	public void emi()
	{
		double emi=(loanamt+(loanamt*roi)*duration)/duration*12;
		System.out.println("EMI = "+emi);
	}
}

class nintythree
{
	public static void main(String [] args)
	{
		homeloan h1;
		h1=new homeloan();
		h1.setdata(3652,32,"devkar panand",9165,1410,"rehan","kolhapur","housing","single","rehan",2445.5,2683.2,300,"devkarpanand",236555,20000,0.10,15);
		h1.showdata();
		h1.downpayment();
		h1.emi();

		System.out.println();

		goldloan g1;
		g1=new goldloan();
		g1.setdata(3652,32,"devkar panand",9165,1410,"rehan","kolhapur",300,"earinings",22,"redkar ","devkarpanand",268200,300000,15,0.10);
		g1.showdata();
		g1.settlement();

		System.out.println();

		carloan c1;
		c1= new carloan();
		c1.setdata(3652,32,"devkar panand",9165,1410,"rehan","kolhapur","fortuner","m21","white","diesel","4stroke",230,2000,20000,8333,300000,3000004,5,0.10,10000);
		c1.showdata();
		c1.onroadprice();
		c1.emi();

		System.out.println();

		education e1;
		e1=new education();
		e1.setdata(3652,32,"devkar panand",9165,1410,"rehan","kolhapur","postgd","btech","dypsn","suk",4,200000,2000,"rehan",10,0.10,"emplyoee",30000);
		e1.showdata();
		e1.emi();

		System.out.println();

		agricultureloan a1;
		a1=new agricultureloan();
		a1.setdata(3652,32,"devkar panand",9165,1410,"rehan","kolhapur",7,"devkar panand",10,"farming",300000,"rice",0.10,6);
		a1.showdata();
		a1.settlementamt();

		System.out.println();

		personalloan p1;
		p1=new personalloan();
		p1.setdata(3652,32,"devkar panand",9165,1410,"rehan","kolhapur","infosys","softwarre","kolhapurr","manager","kp",365,5,790,3000,300000,8,0.10);
		p1.showdata();
		p1.emi();
		p1.inhandamt();

		System.out.println();

		businessloan b1;
		b1=new businessloan();
		b1.setdata(753951,159357,"A ward kop",654123,6013939,"Tejas","kolhapur","software company","IT","single",100,"Tushar","Kolhapur","web",5000000,2000000,0.12,10,578345);
		b1.showdata();
		b1.totalaccect();
		b1.emi();

	}
}