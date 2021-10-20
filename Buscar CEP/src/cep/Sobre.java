package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/icons/logo.png")));
		setBounds(150, 150, 451, 291);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP 1.0");
		lblNewLabel.setBounds(55, 31, 158, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Autor: Daniel dias");
		lblNewLabel_1.setBounds(55, 79, 158, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("WEB service:");
		lblNewLabel_2.setBounds(55, 133, 85, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblWebService = new JLabel("republicavirtual.com.br");
		lblWebService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://www.republicavirtual.com.br/");
			}
		});
		lblWebService.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblWebService.setForeground(SystemColor.textHighlight);
		lblWebService.setBounds(137, 133, 149, 14);
		getContentPane().add(lblWebService);
		
		JButton btnGIT = new JButton("");
		btnGIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/Dvddias");
			}
		});
		btnGIT.setBackground(SystemColor.control);
		btnGIT.setBorder(null);
		btnGIT.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGIT.setIcon(new ImageIcon(Sobre.class.getResource("/icons/GIT.png")));
		btnGIT.setBounds(40, 176, 48, 48);
		getContentPane().add(btnGIT);
		
		JButton btnYOU = new JButton("");
		btnYOU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://www.youtube.com/playlist?list=PLbEOwbQR9lqxVuDWNIrG57_JGcbIL3FWP");
			}
		});
		btnYOU.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnYOU.setBackground(SystemColor.control);
		btnYOU.setIcon(new ImageIcon(Sobre.class.getResource("/icons/youtube.png")));
		btnYOU.setBorder(null);
		btnYOU.setBounds(103, 176, 48, 48);
		getContentPane().add(btnYOU);

	}// fim do construtor
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
