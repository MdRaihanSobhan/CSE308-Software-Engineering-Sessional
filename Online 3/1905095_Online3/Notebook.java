public class Notebook extends Device{
    public Notebook(OperatingSystem operatingSystem) {
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
