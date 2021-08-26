package _13_lights_out;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * Lights Out is a puzzle game with a grid of lights that are either on (light
 * gray) or off (white). Pressing any light will toggle it and its adjacent
 * lights. The goal of the game is to switch all the lights off.
 * 
 * Follow the instructions below to create your own version of Lights Out
 * 
 * 
 */
public class LightsOut implements MouseListener {

	public LightsOut() {

		/** PART 1. CREATE YOUR LIGHT BOARD **/
		// a. create a basic UI and add 25 JLabels (these are your lights)
		// - change the layout of your panel to a 5x5 grid:
		// - panel.setLayout(new GridLayout(5, 5));

		// b. use setText() to add a position number to each light (0-24).

		// c. set the background of each label to LIGHT_GRAY
		// - you will also have to set the background to opaque.
		// - Use light.setOpaque(true);

		// d. add a mouseListener to each light
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		/** PART 2: TOGGLE NEIGHBORING LIGHTS **/
		// a. get the light that was clicked on `(JLabel) e.getSource`

		// b. get the number of the light

		// c. Now use the makeMove method to code which lights turn on and off.

		// e. check if the player has won (e.g. all the lights are off)
		// ---- HINT: use `getLightAtPosition` to get the light at each position

		/** PART 3: RANDOMIZE YOUR BOARD **/
		// a. Go back to the constructor and randomize your board

		// b. To ensure the puzzle is solvable make a series of random moves on the
		// light board.
	}

	void makeMove(JPanel lightPanel, int pos) {
		toggle((JLabel) lightPanel.getComponent(pos));
		if (pos >= 5) {
			toggle((JLabel) lightPanel.getComponent(pos - 5));
		}
		if ((pos + 1) % 5 != 0) {
			toggle((JLabel) lightPanel.getComponent(pos + 1));
		}
		if (pos % 5 != 0) {
			toggle((JLabel) lightPanel.getComponent(pos - 1));
		}
		if (pos + 5 <= 24) {
			toggle((JLabel) lightPanel.getComponent(pos + 5));
		}
	}

	JPanel getLightAtPosition(JPanel panel, int lightPosition) {
		return (JPanel) panel.getComponent(lightPosition);
	}

	void toggle(JLabel label) {
		if (label.getBackground() == Color.WHITE) {
			label.setBackground(Color.LIGHT_GRAY);

		} else {
			label.setBackground(Color.WHITE);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
	}
}
