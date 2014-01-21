package affichage;



import javax.swing.JFrame;

public class Cadre extends JFrame{
	private static final long serialVersionUID = 1L;
	public static final int SIZEH =600;
	public static final int SIZEL =800;
	public Cadre()
	{
	    setSize(SIZEL,SIZEH);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("Traffic");
		
		FenetrePpaleExplosion f = new FenetrePpaleExplosion();
		add(f);
	}
}
