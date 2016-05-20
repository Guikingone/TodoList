/**
 * Created by Guillaume on 20/05/2016.
 */
public abstract class Task {

    /**
     * @var label
     */
    private String label;

    /**
     * @var state
     */
    private Boolean state;

    /**
     * The constructor.
     *
     * @param label Description de la tache
     */
    public Task(String label) {
        setLabel(label);
        setState(false);
    }

    /**
     * Affichage d'une tache sous forme de chaanes de caractares
     *
     * @return Le nom de la tache suivi de son etat
     */
    public abstract String toString();

    /**
     * Passage d'une tache a l'etat "fait"
     */
    public void done() {
        setState(true);
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
        return getState();
    }

    // Start of user code (user defined methods for Task)

    // End of user code
    /**
     * Returns label.
     * @return label
     */
    protected String getLabel() {
        return this.label;
    }

    /**
     * Sets a value to attribute label.
     * @param label
     */
    protected void setLabel(String label) {
        this.label = label;
    }

    /**
     * Returns state.
     * @return state
     */
    protected Boolean getState() {
        return this.state;
    }

    /**
     * Sets a value to attribute state.
     * @param state
     */
    protected void setState(Boolean state) {
        this.state = state;
    }
}
