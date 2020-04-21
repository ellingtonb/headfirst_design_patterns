package Advanced.Objects;

import Advanced.Interfaces.Observer;
import Advanced.Interfaces.Subject;

abstract public class AbstractObserver implements Observer {
    protected final Subject subject;

    public AbstractObserver(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    public void startObserver() {
        subject.registerObserver(this);
    }

    public void stopObserver() {
        subject.removeObserver(this);
    }
}
