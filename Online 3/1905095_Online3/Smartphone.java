public class Smartphone extends Device{
    public Smartphone(OperatingSystem operatingSystem) {
        super(operatingSystem);
    }

    @Override
    public void enableStoreFile() {
        this.operatingSystem.storeFiles();
    }

    @Override
    public void enableInteract() {
        this.operatingSystem.interactDevice();
    }

    @Override
    public void enableCommunicate() {
        this.operatingSystem.communicate();
    }
}
