package com.BVBCET.Pleiadeswidget;


import java.util.Random;

import android.app.Activity;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RemoteViews;

public class WidgetActivity extends AppWidgetProvider  {
    /** Called when the activity is first created. */
   
    String[] events={
			"Ayutigata",
			"Yudhastra",
			"Wheels On Fire",
			"Vid-Youth",
			"Electro fantasy",
			"Code-Chef",
			"Online Treasure Hunt",
			"Mech It",
			"Anveshhanam",
			"Distinguished Engineer",
			"Hang Over",
			"Ayutigata",
			"Anveshhanam",
			"Ayutigata",
			"Cipher Villa",
			"Algo Relay",
			"Auto Park",
			"Micro Codes",
			"Crisis Management",
			"Kurukshetra",
			"Junkyard -2",
			"Battle Slash",
			"µ- Buzz",
			"IT Quiz",
			"Maze Solving Robot",
			"Prastuti",
			"Auto Quiz",
			"Entrant",

		};
  String[] day={
			"Day 1",
			"Day 1",
			"Day 1",
			"Day 1",
			"Day 1",
			"Day 1",
			"Day 1",
			"Day 1",
			"Day 1",
			"Day 1",
			"Day 2",
			"Day 2",
			"Day 2",
			"Day 2",
			"Day 2",
			"Day 2",
			"Day 2",
			"Day 2",
			"Day 2",
			"Day 2",
			"Day 2",
			"Day 3",
			"Day 3",
			"Day 3",
			"Day 3",
			"Day 3",
			"Day 3",
			"Day 3",

		};
  String[] start_end_time={
			"10am-2pm",
			"10am-5pm",
			"10am-5pm",
			"10am-5pm",
			"11am-5pm",
			"10am-5pm",
			"11am-5pm",
			"10am-5pm",
			"03pm-6pm",
			"10am-5pm",
			"09am-5pm",
			"09am-11am",
			"11pm-2pm",
			"3pm-6pm",
			"10am-4pm",
			"11am-5pm",
			"09am-1pm",
			"12pm-6pm",
			"09am-5pm",
			"09am-5pm",
			"9am-6pm",
			"9am-5pm",
			"9am-4am",
			"1pm-6pm",
			"10am-4pm",
			"9am-3pm",
			"9am-5pm",
			"9am-6pm",

		};
  String[] vanue={
			"CEC 107 & 108",
			"Civil Lawn",
			"Opposite to Canteen",
			"Electrical Department",
			"EC Department",
			"LHC101 & MCA Dept",
			"ISE Labs",
			"Robotics Dept",
			"Mech Drawing Hall",
			"LHC201",
			"Mech Lawn",
			"Civil Lawn",
			"Civil Lawn",
			"LHC101",
			"ISE Labs",
			"CSE Labs",
			"LHC Lobby",
			"LHC 102 & LHC 103",
			"LHC201",
			"MCA Labs",
			"",
			"infront of Auto Dept/opposite to Civil Dept",
			"Electrical Department",
			"LHC201",
			"1st floor Mech lobby",
			"Biotech Dept corridor",
			"LHC101",
			"MSB203 and MSB204",


		};
 //int number=0;
  @Override
  public void onUpdate(Context context, AppWidgetManager appWidgetManager,
      int[] appWidgetIds) {
	   // Get all ids
    ComponentName thisWidget = new ComponentName(context,
        WidgetActivity.class);
    int[] allWidgetIds = appWidgetManager.getAppWidgetIds(thisWidget);
    for (int widgetId : allWidgetIds) {
      // Create some random data
      int number = (new Random().nextInt(28));

      RemoteViews remoteViews = new RemoteViews(context.getPackageName(),
          R.layout.main);
      
      // Set the text
      remoteViews.setTextViewText(R.id.ename, events[number]);
      remoteViews.setTextViewText(R.id.day_t, day[number]);
      remoteViews.setTextViewText(R.id.tim, start_end_time[number]);
      remoteViews.setTextViewText(R.id.van, "Vanue:"+vanue[number]);
      // Register an onClickListener
   
      Intent intent = new Intent(context, WidgetActivity.class);

      intent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
      intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, appWidgetIds);

      PendingIntent pendingIntent = PendingIntent.getBroadcast(context,
          0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
      remoteViews.setOnClickPendingIntent(R.id.ename, pendingIntent);
      remoteViews.setOnClickPendingIntent(R.id.day_t, pendingIntent);
      remoteViews.setOnClickPendingIntent(R.id.imageView1, pendingIntent);
      remoteViews.setOnClickPendingIntent(R.id.tim, pendingIntent);
      remoteViews.setOnClickPendingIntent(R.id.van, pendingIntent);
    }
    
  }
} 