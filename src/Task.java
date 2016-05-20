/**
 * Created by Guillaume on 20/05/2016.
 */
public class Task {

    /**
     * @var label
     */
    public String label;

    /**
     * @var state
     */
    public Boolean state;

    /**
     * The constructor.
     *
     * @param label Description de la tache
     */
    public Task(String label) {
        this.label = label;
    }

    /**
     * Affichage d'une tache sous forme de chaanes de caractares
     *
     * @return Le nom de la tache suivi de son etat
     */
    public String toString() {
        return "Tache '" + this.label + "' => " + this.state;
    }

    /**
     * Passage d'une tache a l'etat "fait"
     */
    public void done() {
        state = true;
    }

    /**
     * Indique l'etat de la tache
     *
     * @return Etat de la tache :<ul>
     * 			<li>true : fait</li>
     * 			<li>false : a faire</li>
     * 			</ul>
     */
    public Boolean isDone() {
        return state;
    }

    // Start of user code (user defined methods for Task)

    // End of user code
    /**
     * Returns label.
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Sets a value to attribute label.
     * @param newLabel
     */
    public void setLabel(String newLabel) {
        this.label = newLabel;
    }

    /**
     * Returns state.
     * @return state
     */
    public Boolean getState() {
        return this.state;
    }

    /**
     * Sets a value to attribute state.
     * @param newState
     */
    public void setState(Boolean newState) {
        this.state = newState;
    }
}
