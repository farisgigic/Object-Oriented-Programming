package Week_13.FourthTask;

interface OldDevice
{
    void operateOldFunction();
}
interface NewDevice
{
    void operateNewFunction();
}
class OldDeviceImpl implements OldDevice
{
    @Override
    public void operateOldFunction(){

    }
}
class NewDeviceImpl implements NewDevice
{
    @Override
    public void operateNewFunction(){

    }
}
class DeviceAdapter implements NewDevice
{
    private OldDevice oldDevice;
    @Override
    public void operateNewFunction(){}
    public DeviceAdapter(OldDevice oldDevice){
        this.oldDevice = oldDevice;
    }
}
public class MainAdapter {
    public static void main(String[] args) {
        NewDevice newDevice = new NewDeviceImpl();
        OldDevice oldDevice = new OldDeviceImpl();
        newDevice.operateNewFunction();
        DeviceAdapter deviceAdapter = new DeviceAdapter(oldDevice);
        deviceAdapter.operateNewFunction();
    }
}
