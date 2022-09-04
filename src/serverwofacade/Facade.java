/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverwofacade;

/**
 *
 * @author LENOVO
 */
public class Facade {
    private static Facade myFacadeObj = null;
    public static Facade getMyFacadeObject() {
        if(myFacadeObj == null)
            myFacadeObj = new Facade();
        return myFacadeObj;
    }
    public void classScheduleServer() {
        ScheduleServer obj = new ScheduleServer();
        obj.startBooting();
	obj.readSystemConfigFile();
	obj.init();
	obj.initializeContext();
	obj.initializeListeners();
	obj.createSystemObjects();
	System.out.println("Start working......");
	System.out.println("After work done.........");
	obj.releaseProcesses();
	obj.destory();
	obj.destroySystemObjects();
	obj.destoryListeners();
	obj.destoryContext();
	obj.shutdown();
    }
}
