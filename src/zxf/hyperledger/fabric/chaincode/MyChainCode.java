package zxf.hyperledger.fabric.chaincode;

import org.hyperledger.fabric.shim.ChaincodeBase;
import org.hyperledger.fabric.shim.ChaincodeStub;

public class MyChainCode extends ChaincodeBase {
    public static void main(String[] args) {
        new MyChainCode().start(args);
    }

    @Override
    public Response init(ChaincodeStub chaincodeStub) {
        return null;
    }

    @Override
    public Response invoke(ChaincodeStub chaincodeStub) {
        return null;
    }
}
