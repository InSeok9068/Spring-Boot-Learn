package com.example.demo.scheduling;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//�� ����crontab �ֱ⼳�� ������� �˾ƺ���.

//*           *������������*������������*������������*������������*
//��(0-59)   ��(0-59)�����ð�(0-23)������(1-31)������(1-12)��������(0-7) 
//�� �� ��ġ�� ���� �ֱ⸦ �ٸ��� ���� �� �� �ִ�.
//������� ��-��-�ð�-��-��-���� ���̴�. �׸��� ��ȣ ���� ���� ���� ���� �� ��� �Է� �� ���� �ִ�.
//���Ͽ��� 0�� 7�� �Ͽ����̸�, 1���� �������̰� 6�� ������̴�.

@Component
public class Scheduler {
   @Scheduled(cron = "0 * * * * *")
   public void cronJobSch() {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
      Date now = new Date();
      String strDate = sdf.format(now);
      System.out.println("Java cron job expression:: " + strDate);
   }
}