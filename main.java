package GUI;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.*; // المكتبه اللي فيها ال classes اللي هنستخدمها

public class MainGUI {
	public static void main(String[] args) {
		
		//  Window 
		
		// 1- Frame
		JFrame frame=new JFrame(); // to make my window
		frame.setTitle("login page"); // هحط العنوان بتاع الفريم بتاعي
		frame.setSize(500,400); // width , height
		frame.setLocation(350, 150); // x-axis -> بسيب من علي الجنب  , y-axis -> بسيب من فوق
		//frame.setResizable(true); // user can control size of window
		//frame.pack(); // to make components fit inside window -> بتطلعلي مشكله ليه بقي ؟
		// because it works with layout manager and i want it absolute which is manual 
		
		
		//  Layout 
		
		// 2- Panel -> mini container inside frame عشان انظم العناصر بتاعتي  
		JPanel panel = new JPanel(); // to sort elements -> بنظم العناصر بتاعتي
		// 3- Absolute Layout
		panel.setLayout(null);  //  Absolute Layout -> تحدد اماكن وترتيب العناصر علي الشاشه
		// Absolute Layout -> set components manual by me عشان كده حطيتها ب null عشان انا اللي اتحكم والغي layout manager
		panel.setBackground(Color.white);
		
		
		// Visual Components
		
		// add to panel not to frame -> panel now is my layout where i control not frame 
		
		// 4- Text Field -> بدخل نص معين زي email , username , بيكون البوكس فيه جاهز واللي بيتحكم فيه الارتفاع
		JTextField txt=new JTextField();
		txt.setText("Mariam");
		txt.setBounds(150,167,200,20);
		panel.add(txt);
		
		// 5- Password Field -> the same as Text field but it hides password ( for security )
		JPasswordField pass=new JPasswordField();
		pass.setText("12345678345621");
		pass.setBounds(150,190,200,20);
		panel.add(pass);
		
		// 6- Check Box -> Box for choose as : remember me 
		JCheckBox bx=new JCheckBox();
		bx.setText("save password");
		bx.setBounds(45,220,200,20);
		bx.setBackground(Color.white);
		panel.add(bx);
		
		// 7- Button -> button for login / sign up
		JButton bt=new JButton();
		bt.setText("login");
		bt.setBounds(170,250,100,20);
		panel.add(bt);
		
		// 8- Label -> نص ثابت او صوره زي المثال اللي تحت 
		JLabel label1=new JLabel();
		label1.setText("Username : ");
		label1.setBounds(50,100,500,150); // x , y , width , height
		panel.add(label1); 
		
		JLabel label2=new JLabel();
		label2.setText("Password : ");
		label2.setBounds(50,120,500,160); // x , y , width , height
		panel.add(label2);
		 
		// 9- Combo Box -> مثلا انا في صفحه هختار اللي بيعمل لوج ان ده admin , user وهكذا -> choose multiple of things store it in array
		String []  s= { "Admin" , "User" , "Register" };
		JComboBox cb=new JComboBox(s); // لازم اكتبها وانا باخد object
		// cb.addItem(s); -> الفانكشن بتاخد عنصر واحد مش اراي فعشان كده لا ينفع ان اكتبها هكذا بل بحطها وانا باخد الاوبجكت
		cb.setBounds(320,10,100,25);
		cb.setBackground(Color.white);
		panel.add(cb);
		
		// 10 - Icon ->صورة نستخدمها داخل  JLabel , JButton -> add photo
		ImageIcon icon = new ImageIcon("images/gmail.png"); // عايزه اضيف الصورة اللي في فولدر images واسمها gmail.png -> read photo
		// عشان اغير من حجم الصورة ImageIcon لا يدعم هذه الخاصيه وعشان كده هنستخدم Image
		Image img = icon.getImage();  // get photo -> ( abstract class )
		Image newImg = img.getScaledInstance(60, 60, Image.SCALE_SMOOTH); // to minimize photo , ( width , height , hints )
		// hints -> هي بعد ما اصغر الصورة عايو جودة الصورة بتاعتي تكون جودة عاليه زي اللي انا مستخدماها ولا جوده منخفضه
		/*
		 Image.SCALE_SMOOTH	->  أفضل جودة للصورة
		Image.SCALE_FAST	->  أسرع لكن الجودة أقل 
		Image.SCALE_DEFAULT  -> 	الوضع الافتراضي  
		Image.SCALE_REPLICATE ->	طريقة بسيطة للتكبير
		Image.SCALE_AREA_AVERAGING -> جودة عالية للتصغير
		*/
		ImageIcon miniImg = new ImageIcon();
		// JLabel ->  مش بيتعامل ما كلاس Image بيتعامل مع ImageIcon فلازم احول الصوره بتاعتي من Image to ImageIcon
		miniImg.setImage(newImg);
		JLabel image = new JLabel();
		image.setIcon(miniImg);
		image.setBounds(200,60,60,60);
		panel.add(image);
		frame.setIconImage(icon.getImage()); // عشان احطها في الفريم فوق وهي بتاخد image
		
		
		// 11 - JList ->  قائمه عناصر معينه اليوزر يختار منها
		String[] lang = {"English","Arabic"};
		JList list = new JList(lang);
		list.setBounds(40,10,100,40);
		panel.add(list);
		
		
		
		frame.add(panel);
		frame.setVisible(true);
		
		
		
		
		

	}

}

