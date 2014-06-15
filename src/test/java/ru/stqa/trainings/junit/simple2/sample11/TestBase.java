package ru.stqa.trainings.junit.simple2.sample11;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import biz.futureware.mantis.rpc.soap.client.IssueData;
import biz.futureware.mantis.rpc.soap.client.MantisConnectLocator;
import biz.futureware.mantis.rpc.soap.client.MantisConnectPortType;

public class TestBase {

  protected boolean bugIsOpen(int bugId) {
    try {
      MantisConnectLocator mcl = new MantisConnectLocator();
      MantisConnectPortType mcp = mcl.getMantisConnectPort(
          new URL("http://localhost/mantisbt-1.2.17/api/soap/mantisconnect.php"));
      IssueData issue = mcp.mc_issue_get("administrator", "root",
          BigInteger.valueOf(bugId));
      String status = issue.getStatus().getName();
      if ("closed".equals(status) || "resolved".equals(status)) {
        return false;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return true;
  }

}
