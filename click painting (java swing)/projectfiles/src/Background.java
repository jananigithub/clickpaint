
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Background implements ActionListener {

	protected JPanel bgpanel;
	protected ImagePanel cpanel;
	protected JFrame frame ;
	public JPanel dpanel;
	public JButton strike;
	protected JButton animals;
	protected JButton plants;
	protected JButton vehicles;
	protected JButton v1;
	protected JButton v2;
	protected JButton v3;
	protected JButton v4;
	protected JButton v5;
	protected JButton v6;
	protected JButton v7;
	protected JButton v8;
	protected JButton v9;
	protected JButton v10;
	public JButton stamp;
	public JPanel n1panel;
	public JPanel vehiclePanel;
	private int v;
	private int p;
	private int a;
	private int flag;
	private int i;
	private int control;
	public JLabel labela;
	public JLabel labelb;
	public JButton back;
	public JButton newButton;
	public JButton save;
	public JButton zoomin;
	public JButton zoomout;
	public JButton open;
	public JButton erase;
	public JButton back1;
	public Background(){

		frame = new JFrame("paint");
		frame.setSize(1000,600);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		dpanel=new JPanel();
		dpanel.setPreferredSize(new Dimension(600,600));
		dpanel.setBackground(Color.BLACK);
		flag=1;
		bgpanel = new JPanel();
		cpanel =new ImagePanel();
		n1panel = new JPanel();
		vehiclePanel=new JPanel(new GridLayout(11,1));
	//	vehiclePanel.setLayout( new BoxLayout( vehiclePanel, BoxLayout.X_AXIS ) );
	    bgpanel.setPreferredSize(new Dimension(100,600));
	    cpanel.setPreferredSize(new Dimension(500,500));
	    n1panel.setPreferredSize(new Dimension(100,600));
		vehiclePanel.setPreferredSize(new Dimension(100,600));
		bgpanel.setBackground(Color.DARK_GRAY);
		cpanel.setBackground(Color.white);
		n1panel.setBackground(Color.DARK_GRAY);
		vehiclePanel.setBackground(Color.DARK_GRAY);
		frame.add(bgpanel);
		frame.add(dpanel);
		frame.add(n1panel);
		frame.add(vehiclePanel);
		dpanel.add(cpanel);
		stamp=new JButton("Stamps");
		stamp.setActionCommand("stamp");
		stamp.addActionListener(this);
        newButton=new JButton("New");
        newButton.setActionCommand("new");
        newButton.addActionListener(this);
		
		save =new JButton("Save");
		save.setActionCommand("save");
		save.addActionListener(this);
		
		zoomin =new JButton("Zoom in");
		zoomin.setActionCommand("zoomin");
		zoomin.addActionListener(this);
		
		zoomout =new JButton("Zoom out");
		zoomout.setActionCommand("zoomout");
		zoomout.addActionListener(this);
		
		open =new JButton("Open");
		open.setActionCommand("open");
		open.addActionListener(this);
		
		erase =new JButton("Erase");
		erase.setActionCommand("erase");
		erase.addActionListener(this);
		newButton.setPreferredSize(new Dimension(100,40));
		stamp.setPreferredSize(new Dimension(100,40));
		zoomin.setPreferredSize(new Dimension(100,40));
		zoomout.setPreferredSize(new Dimension(100,40));
		save.setPreferredSize(new Dimension(100,40));
		open.setPreferredSize(new Dimension(100,40));
		erase.setPreferredSize(new Dimension(100,40));
		bgpanel.add(newButton);
		bgpanel.add(stamp);
		bgpanel.add(zoomin);
		bgpanel.add(zoomout);
		bgpanel.add(erase);
		bgpanel.add(save);
		bgpanel.add(open);
		
		animals=new JButton("animals");
		animals.setPreferredSize(new Dimension(100,40));
		animals.setActionCommand("animals");
		plants=new JButton("plants");
		plants.setActionCommand("plants");
		plants.setPreferredSize(new Dimension(100,40));
		vehicles=new JButton("vehicles");
		vehicles.setActionCommand("vehicles");
		vehicles.setPreferredSize(new Dimension(100,40));

		back1=new JButton("<-- Back");
        back1.setActionCommand("back1");
        back1.setPreferredSize(new Dimension(100,40));
        back1.addActionListener(this);
		n1panel.add(back1);

		back=new JButton("<-- Back");
        vehiclePanel.add(back);
        back.setActionCommand("back");
        back.addActionListener(this);

		n1panel.add(animals);
		animals.addActionListener(this);
        n1panel.add(plants);
		plants.addActionListener(this);
        n1panel.add(vehicles);
		vehicles.addActionListener(this);



	//	n1panel.setVisible(false);

        strike=new JButton("Strike");
        strike.setActionCommand("strike");
        strike.addActionListener(this);
        strike.setPreferredSize(new Dimension(100,100));
        bgpanel.add(strike);
        
   

        v1=new JButton("up");
        v1.setActionCommand("up");
	//	v1.setPreferredSize(new Dimension(90,30));
		v2=new JButton("balloon");
		v2.setActionCommand("veh1");
	//	v2.setPreferredSize(new Dimension(90,30));
		v3=new JButton("boxcar");
		v3.setActionCommand("veh2");
		//v3.setPreferredSize(new Dimension(90,30));
		v4=new JButton("bus");
		v4.setActionCommand("veh3");
	//	v4.setPreferredSize(new Dimension(90,30));
		v5=new JButton("caboose");
		v5.setActionCommand("veh4");
	//	v5.setPreferredSize(new Dimension(90,30));
		v6=new JButton("car");
		v6.setActionCommand("veh5");
	//	v6.setPreferredSize(new Dimension(90,30));
		v7=new JButton("carriage");
		v7.setActionCommand("veh6");
	//	v7.setPreferredSize(new Dimension(90,30));
		v8=new JButton("cementMixer");
		v8.setActionCommand("veh7");
	//	v8.setPreferredSize(new Dimension(90,30));
		v9=new JButton("chineseJunk");
		v9.setActionCommand("veh8");
	//	v9.setPreferredSize(new Dimension(90,30));
		v10=new JButton("down");
		v10.setActionCommand("down");
     //   v10.setPreferredSize(new Dimension(90,30));



        vehiclePanel.add(v1);
		v1.addActionListener(this);
        vehiclePanel.add(v2);
		v2.addActionListener(this);
        vehiclePanel.add(v3);
		v3.addActionListener(this);
        vehiclePanel.add(v4);
		v4.addActionListener(this);
        vehiclePanel.add(v5);
		v5.addActionListener(this);
        vehiclePanel.add(v6);
		v6.addActionListener(this);
        vehiclePanel.add(v7);
		v7.addActionListener(this);
        vehiclePanel.add(v8);
		v8.addActionListener(this);
        vehiclePanel.add(v9);
		v9.addActionListener(this);
        vehiclePanel.add(v10);
		v10.addActionListener(this);


		
		vehiclePanel.setVisible(false);


		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    }


	public void backgroundButton()
	{
		        //JLabel title= new JLabel("PAINT");
		 		//title.setForeground(Color.white);
				  //  bgpanel.add(title);
				    //bgpanel.add(stamp);
				    frame.setVisible(true);


	}
		public void actionPerformed(ActionEvent e) {
	   	 String command = e.getActionCommand();
	   	if(command.equals("stamp"))
	  	 {
	  		//n1panel.setVisible(true);
	   		flag=2;

	   	//	bgpanel.remove(bg);

	  	 }
	  	 else if(command.equals("vehicles"))
         {
        /*     cpanel.revalidate();
             cpanel.showimage=false;
            cpanel.repaint();
            */
       //     n1panel.setVisible(false);
             //cpanel.setVisible(true);
          vehiclePanel.setVisible(true);
            control=1;
            v=1;
            v1.doClick();
            flag=3;
         }
         else if(command.equals("plants"))
         {
             /*
             cpanel.revalidate();
             cpanel.showimage=false;
            cpanel.repaint();
            */
         //   n1panel.setVisible(false);
            control=2;
            p=1;
             v1.doClick();
           //  cpanel.setVisible(true);
            vehiclePanel.setVisible(true);
            flag=3;
         }
        else if(command.equals("animals"))
         {
             /* cpanel.revalidate();
             cpanel.showimage=false;
            cpanel.repaint();
            */
           // n1panel.setVisible(false);
            control=3;
            a=1;
             v1.doClick();
           //  cpanel.setVisible(true);
            vehiclePanel.setVisible(true);
            flag=3;
         }

	  	else if(command.equals("veh1"))
	  	 {
	   		  //cpanel.showimage=true;
	  		  cpanel.setStamp("D:/clicks/best pics/jerry.jpg");

	  	 }

	  	else if(command.equals("veh2"))
	  	 {
	   		 // cpanel.showimage=true;
	  		  cpanel.setStamp("paintme/images/images.jpg");

	  	 }
	  	else if(command.equals("veh3"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/vehicles/bus.png");

	  	 }
	  	else if(command.equals("veh4"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/vehicles/caboose.png");

	  	 }
	  	else if(command.equals("veh5"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/vehicles/car.png");

	  	 }
	  	else if(command.equals("veh6"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/vehicles/carriage.png");

	  	 }
	  	else if(command.equals("veh7"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/vehicles/cementMixer.png");

	  	 }
	  	else if(command.equals("veh8"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/vehicles/chineseJunk.png");

	  	 }
	  	else if(command.equals("veh9"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/vehicles/dumper.png");

	  	 }
	  	else if(command.equals("veh10"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/vehicles/eddieCopter.png");

	  	 }
	  	else if(command.equals("veh11"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/vehicles/firetruck.png");

	  	 }
	  	else if(command.equals("veh12"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/vehicles/flight.png");

	  	 }
	  	else if(command.equals("veh13"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/vehicles/indycar.png");

	  	 }
	  	else if(command.equals("veh14"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/vehicles/parachute.png");

	  	 }
	  	else if(command.equals("veh15"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/vehicles/plane.png");

	  	 }
	  	else if(command.equals("veh16"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/vehicles/raptor.png");

	  	 }
	  	 else if(command.equals("veh17"))
	  	 {
	   		  cpanel.setStamp("images/vehicles/sedan.png");
	  	 }
	  	 else if(command.equals("veh18"))
	  	 {
	   		  cpanel.setStamp("images/vehicles/tanker.png");
	  	 }
         else if(command.equals("veh19"))
	  	 {
	   		  cpanel.setStamp("images/vehicles/tender.png");
	  	 }
         else if(command.equals("veh20"))
	  	 {
	   		  cpanel.setStamp("images/vehicles/towTruck.png");
	  	 }
         else if(command.equals("veh21"))
	  	 {
	   		  cpanel.setStamp("images/vehicles/toy_train.png");
	  	 }
         else if(command.equals("veh22"))
	  	 {
	   		  cpanel.setStamp("images/vehicles/tricycle.png");
	  	 }
         else if(command.equals("veh23"))
	  	 {
	   		  cpanel.setStamp("images/vehicles/truck.png");
	  	 }
         else if(command.equals("veh24"))
	  	 {
	   		  cpanel.setStamp("images/vehicles/tux_tractor.png");
	  	 }



	  	else if(command.equals("p1"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/plants/ashoka.png");

	  	 }

	  	else if(command.equals("p2"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/plants/birch.png");

	  	 }
	  	else if(command.equals("p3"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/plants/coconut.png");

	  	 }
	  	else if(command.equals("p4"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/plants/eggplant.png");

	  	 }
	  	else if(command.equals("p5"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/plants/iris.png");

	  	 }
	  	else if(command.equals("p6"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/plants/lavender.png");

	  	 }
	  	else if(command.equals("p7"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/plants/marigold.png");

	  	 }
	  	else if(command.equals("p8"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/plants/mushroom.png");

	  	 }
	  	else if(command.equals("p9"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/plants/oak.png");

	  	 }
	  	else if(command.equals("p10"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/plants/pine.png");

	  	 }
	  	else if(command.equals("p11"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/plants/rambutan.png");

	  	 }
	  	else if(command.equals("p12"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/plants/red flower.png");

	  	 }
	  	else if(command.equals("p13"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/plants/red-gazania.png");

	  	 }
	  	else if(command.equals("p14"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/plants/rose.png");

	  	 }
	  	else if(command.equals("p15"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/plants/thyme.png");

	  	 }
	  	else if(command.equals("p16"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/plants/yellow-flower.png");

	  	 }



	  	else if(command.equals("a1"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/bear.png");

	  	 }

	  	else if(command.equals("a2"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/bee.png");

	  	 }
	  	else if(command.equals("a3"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/bison.png");

	  	 }
	  	else if(command.equals("a4"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/blackbird.png");

	  	 }
	  	else if(command.equals("a5"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/bull.png");

	  	 }
	  	else if(command.equals("a6"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/camel.png");

	  	 }
	  	else if(command.equals("a7"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/cow.png");

	  	 }
	  	else if(command.equals("a8"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/crow.png");

	  	 }
	  	else if(command.equals("a9"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/deer.png");

	  	 }
	  	else if(command.equals("a10"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/dog.png");
	  	 }
	  	else if(command.equals("a11"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/dolphin.png");

	  	 }
	  	else if(command.equals("a12"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/donkey.png");

	  	 }
	  	else if(command.equals("a13"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/duck.png");

	  	 }
	  	else if(command.equals("a14"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/elephant.png");

	  	 }
	  	else if(command.equals("a15"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/fly.png");

	  	 }
	  	else if(command.equals("a16"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/fox.png");

	  	 }
	  	else if(command.equals("a17"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/giraffe.png");

	  	 }

	  	else if(command.equals("a18"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/goat.png");

	  	 }
	  	else if(command.equals("a19"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/gorilla.png");

	  	 }
	  	else if(command.equals("a20"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/grasshopper.png");

	  	 }
	  	else if(command.equals("a21"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/hen.png");

	  	 }
	  	else if(command.equals("a22"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/horse.png");

	  	 }
	  	else if(command.equals("a23"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/lion.png");

	  	 }
	  	else if(command.equals("a24"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/mouse.png");

	  	 }
	  	else if(command.equals("a25"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/owl.png");

	  	 }
	  	else if(command.equals("a26"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/penguin.png");

	  	 }
	  	else if(command.equals("a27"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/pig.png");

	  	 }
	  	else if(command.equals("a28"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/rabbit.png");

	  	 }
	  	else if(command.equals("a29"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/sheep.png");

	  	 }
	  	else if(command.equals("a30"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/tiger.png");

	  	 }
	  	else if(command.equals("a31"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/xanthia.png");

	  	 }
	  	else if(command.equals("a32"))
	  	 {
	   		  cpanel.showimage=true;
	  		  cpanel.setStamp("images/animals/zebra.png");

	  	 }





	  	else if(command.equals("up"))
	  	 {
	  	     if(v!=1)
	  	      v-=1;
	  	      if(p!=1)
                p-=1;
            if(a!=1)
                a-=1;


	   		  reVehicle();

	  	 }
	  	else if(command.equals("down"))
	  	 {
	  	     if(v!=3)
	   		  v+=1;
	   		 if(p!=2)
	   		  p+=1;
	   		  if(a!=4)
	   		  a+=1;
	   		  reVehicle();
         }



        else if (command.equals("back"))
        {
          //  n1panel.setVisible(true);
           // vehiclePanel.setVisible(false);
            flag=2;
        }
        else if (command.equals("back1"))
        {
            //n1panel.setVisible(true);
           // vehiclePanel.setVisible(false);
            flag=1;
        }
        else if (command.equals("new"))
        {
	   		Color backgroundColor = JColorChooser.showDialog(frame,"Choose background color",null);
   	      if(backgroundColor != null){
   	    	 cpanel.showimage=false;
   	    	 cpanel.setBackground(backgroundColor);
 	    	 cpanel.set(backgroundColor);

        //	n1panel.setVisible(false);
            vehiclePanel.setVisible(false);
/*            cpanel.setForeground(Color.WHITE);
            cpanel.setBackground(Color.WHITE);
*/
            flag=1;
            }


        }
	   	else if(command.equals("erase"))
	   	{
	   	cpanel.showimage=false;
	   	}
		else if(command.equals("zoomin"))
	   	{
	     cpanel.zoomin();
	   	}
		else if(command.equals("zoomout"))
	   	{
	     cpanel.zoomout();
	   	}
		else if(command.equals("save"))
	   	{
	     cpanel.save(cpanel);
	   	}
		else if(command.equals("open"))
	   	{
	     cpanel.open(cpanel);
	     
	   	}
	   	
         else if(command.equals("strike"))
         {
             switch(flag)
             {
             case 1:
                 {
                     if(i==1)
                        newButton.doClick();
                     else if(i==2)
                         stamp.doClick();
                     else if(i==3)
                         zoomin.doClick();
                     else if(i==4)
                         zoomout.doClick();
                     else if(i==5)
                         erase.doClick();
                     else if(i==6)
                         save.doClick();
                    else
                         open.doClick();
                     break;
                 }
             case 2:
                {
                	if (i==1)
                			back1.doClick();
                	else if(i==2)
                            animals.doClick();
                    else if(i==3)
                            plants.doClick();
                    else
                            vehicles.doClick();
                            break;
                }
             case 3:
                {
                    if(i==1)
                            v1.doClick();
                    else if(i==2)
                            v2.doClick();
                    else if(i==3)
                            v3.doClick();
                    else if(i==4)
                            v4.doClick();
                    else if(i==5)
                            v5.doClick();
                    else if(i==6)
                            v6.doClick();
                    else if(i==7)
                            v7.doClick();
                    else if(i==8)
                            v8.doClick();
                    else if(i==9)
                            v9.doClick();
                    else if(i==10)
                            v10.doClick();
                    else
                            back.doClick();

                }



             }

         }


	     }


        public void draw() throws java.lang.InterruptedException
        {
            i=0;
            while(true)
            {
             switch(flag)
             {
             case 1:
                 {
                	 newButton.setForeground(Color.GRAY);
                	 stamp.setForeground(Color.GRAY);
                	 zoomin.setForeground(Color.GRAY);
                     zoomout.setForeground(Color.GRAY);
                     erase.setForeground(Color.GRAY);
                     save.setForeground(Color.GRAY);
                     open.setForeground(Color.GRAY);
                        i=(i+1)%7;
                        if(i==1)
                            newButton.setForeground(Color.MAGENTA);
                        else if(i==2)
                            stamp.setForeground(Color.MAGENTA);
                        else if(i==3)
                            zoomin.setForeground(Color.MAGENTA);
                        else if(i==4)
                            zoomout.setForeground(Color.MAGENTA);
                        else if(i==5)
                            erase.setForeground(Color.MAGENTA);
                        else if(i==6)
                            save.setForeground(Color.MAGENTA);
                        else
                            open.setForeground(Color.MAGENTA);
                        Thread.sleep(1000);
                        break;
                 }
             case 2:
                {
                		back1.setForeground(Color.GRAY);
                        animals.setForeground(Color.GRAY);
                        plants.setForeground(Color.GRAY);
                        vehicles.setForeground(Color.GRAY);
                        i=(i+1)%4;
                        if(i==1)
                            back1.setForeground(Color.MAGENTA);
                        else if(i==2)
                            animals.setForeground(Color.MAGENTA);
                        else if(i==3)
                            plants.setForeground(Color.MAGENTA);
                        else
                            vehicles.setForeground(Color.MAGENTA);
                    Thread.sleep(1000);
                    break;
                }
             case 3:
                {
                        v1.setForeground(Color.GRAY);
                        v2.setForeground(Color.GRAY);
                        v3.setForeground(Color.GRAY);
                        v4.setForeground(Color.GRAY);
                        v5.setForeground(Color.GRAY);
                        v6.setForeground(Color.GRAY);
                        v7.setForeground(Color.GRAY);
                        v8.setForeground(Color.GRAY);
                        v9.setForeground(Color.GRAY);
                        v10.setForeground(Color.GRAY);
                        back.setForeground(Color.GRAY);
                        i=(i+1)%11;
                        if(i==1)
                            v1.setForeground(Color.MAGENTA);
                        else if(i==2)
                            v2.setForeground(Color.MAGENTA);
                        else if(i==3)
                            v3.setForeground(Color.MAGENTA);
                        else if(i==4)
                            v4.setForeground(Color.MAGENTA);
                        else if(i==5)
                            v5.setForeground(Color.MAGENTA);
                        else if(i==6)
                            v6.setForeground(Color.MAGENTA);
                        else if(i==7)
                            v7.setForeground(Color.MAGENTA);
                        else if(i==8)
                            v8.setForeground(Color.MAGENTA);
                        else if(i==9)
                            v9.setForeground(Color.MAGENTA);
                        else if(i==10)
                            v10.setForeground(Color.MAGENTA);
                        else
                            back.setForeground(Color.MAGENTA);
                    Thread.sleep(1000);
                    break;

                }
             }//end of switch
            }//end of while

        }//end of draw()

	     private void reVehicle()
	     {
	         if(control==1)
             {
	         switch(v)
	         {
             case 1:
                {
                    v2.setText("balloon");
                    v2.setActionCommand("veh1");
                    v3.setText("boxcar");
                    v3.setActionCommand("veh2");
                    v4.setText("bus");
                    v4.setActionCommand("veh3");
                    v5.setText("caboose");
                    v5.setActionCommand("veh4");
                    v6.setText("car");
                    v6.setActionCommand("veh5");
                    v7.setText("carriage");
                    v7.setActionCommand("veh6");
                    v8.setText("cementMixer");
                    v8.setActionCommand("veh7");
                    v9.setText("chineseJunk");
                    v9.setActionCommand("veh8");
                    break;
                }
             case 2:
                {
                    v2.setText("dumper");
                    v2.setActionCommand("veh9");
                    v3.setText("eddieCopter");
                    v3.setActionCommand("veh10");
                    v4.setText("firetruck");
                    v4.setActionCommand("veh11");
                    v5.setText("flight");
                    v5.setActionCommand("veh12");
                    v6.setText("indycar");
                    v6.setActionCommand("veh13");
                    v7.setText("parachute");
                    v7.setActionCommand("veh14");
                    v8.setText("plane");
                    v8.setActionCommand("veh15");
                    v9.setText("raptor");
                    v9.setActionCommand("veh16");
                    break;
                }
             case 3:
                {
                    v2.setText("sedan");
                    v2.setActionCommand("veh17");
                    v3.setText("tanker");
                    v3.setActionCommand("veh18");
                    v4.setText("tender");
                    v4.setActionCommand("veh19");
                    v5.setText("Tow Truck");
                    v5.setActionCommand("veh20");
                    v6.setText("Toy train");
                    v6.setActionCommand("veh21");
                    v7.setText("Tricycle");
                    v7.setActionCommand("veh22");
                    v8.setText("Truck");
                    v8.setActionCommand("veh23");
                    v9.setText("Tractor");
                    v9.setActionCommand("veh24");
                    break;
                }
	         }
             }//end of if
             else if(control==2)
             {
                 switch(p)
                 {
                     case 1:
                {
                    v2.setText("Ashoka");
                    v2.setActionCommand("p1");
                    v3.setText("Birch");
                    v3.setActionCommand("p2");
                    v4.setText("Coconut tree");
                    v4.setActionCommand("p3");
                    v5.setText("Egg plant");
                    v5.setActionCommand("p4");
                    v6.setText("Iris");
                    v6.setActionCommand("p5");
                    v7.setText("Lavender");
                    v7.setActionCommand("p6");
                    v8.setText("Marigold");
                    v8.setActionCommand("p7");
                    v9.setText("Mushroom");
                    v9.setActionCommand("p8");
                    break;
                }
             case 2:
                {
                    v2.setText("Oak");
                    v2.setActionCommand("p9");
                    v3.setText("Pine");
                    v3.setActionCommand("p10");
                    v4.setText("Rambutan");
                    v4.setActionCommand("p11");
                    v5.setText("Red flower");
                    v5.setActionCommand("p12");
                    v6.setText("Red gazania");
                    v6.setActionCommand("p13");
                    v7.setText("Rose");
                    v7.setActionCommand("p14");
                    v8.setText("Thyme");
                    v8.setActionCommand("p15");
                    v9.setText("Yellow flower");
                    v9.setActionCommand("p16");
                    break;
                }


                 }

             }
            else if(control==3)
             {
                 switch(a)
                 {
                     case 1:
                {
                    v2.setText("Bear");
                    v2.setActionCommand("a1");
                    v3.setText("Bee");
                    v3.setActionCommand("a2");
                    v4.setText("Bison");
                    v4.setActionCommand("a3");
                    v5.setText("Black bird");
                    v5.setActionCommand("a4");
                    v6.setText("Bull");
                    v6.setActionCommand("a5");
                    v7.setText("Camel");
                    v7.setActionCommand("a6");
                    v8.setText("Cow");
                    v8.setActionCommand("a7");
                    v9.setText("Crow");
                    v9.setActionCommand("a8");
                    break;
                }
             case 2:
                {
                    v2.setText("Deer");
                    v2.setActionCommand("a9");
                    v3.setText("Dog");
                    v3.setActionCommand("a10");
                    v4.setText("Dolphin");
                    v4.setActionCommand("a11");
                    v5.setText("Donkey");
                    v5.setActionCommand("a12");
                    v6.setText("Duck");
                    v6.setActionCommand("a13");
                    v7.setText("Elephant");
                    v7.setActionCommand("a14");
                    v8.setText("Fly");
                    v8.setActionCommand("a15");
                    v9.setText("Fox");
                    v9.setActionCommand("a16");
                    break;
                }
             case 3:
                {
                    v2.setText("Giraffe");
                    v2.setActionCommand("a17");
                    v3.setText("Goat");
                    v3.setActionCommand("a18");
                    v4.setText("Gorilla");
                    v4.setActionCommand("a19");
                    v5.setText("Grasshopper");
                    v5.setActionCommand("a20");
                    v6.setText("Hen");
                    v6.setActionCommand("a21");
                    v7.setText("Horse");
                    v7.setActionCommand("a22");
                    v8.setText("Lion");
                    v8.setActionCommand("a23");
                    v9.setText("Mouse");
                    v9.setActionCommand("a24");
                    break;
                }
                case 4:
                {
                    v2.setText("Owl");
                    v2.setActionCommand("a25");
                    v3.setText("Penguin");
                    v3.setActionCommand("a26");
                    v4.setText("Pig");
                    v4.setActionCommand("a27");
                    v5.setText("Rabbit");
                    v5.setActionCommand("a28");
                    v6.setText("Sheep");
                    v6.setActionCommand("a29");
                    v7.setText("Tiger");
                    v7.setActionCommand("a30");
                    v8.setText("Butterfly");
                    v8.setActionCommand("a31");
                    v9.setText("Zebra");
                    v9.setActionCommand("a32");
                    break;
                }


                 }

             }

	     }



	public static void main(String args[]) throws java.lang.InterruptedException{
		Background b1= new Background();
		b1.backgroundButton();
		b1.draw();


	}

}

