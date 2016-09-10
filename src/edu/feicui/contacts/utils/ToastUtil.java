package edu.feicui.contacts.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Toast����������,����ֻ��һ��Toast�������չʾ����
 * 
 * @author yuanc
 */
public class ToastUtil {

	private static Toast toast;

	public static void show(Context context, String text, int duration) {
		if (toast == null) {
			toast = Toast.makeText(context, text, duration);
		}
		toast.setText(text);
		toast.setDuration(duration);
		toast.show();
	}
}