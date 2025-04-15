public abstract class Device {
    OperatingSystem operatingSystem;

    public Device(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public abstract void enableStoreFile();
    public abstract void enableInteract();
    public abstract void enableCommunicate();

}
