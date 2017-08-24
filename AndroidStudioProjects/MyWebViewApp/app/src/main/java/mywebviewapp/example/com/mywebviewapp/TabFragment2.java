package mywebviewapp.example.com.mywebviewapp;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.view.ViewGroup;
import android.webkit.WebViewClient;


public class TabFragment2 extends Fragment {

    WebView myWebView;
    final static String products = "http://pushauto.com/quotation_requests/";
    String myUrl;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_2, container, false);
        myWebView = (WebView)view.findViewById(R.id.mywebview2);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.getSettings().setJavaScriptEnabled(true);

        if(myUrl==null){
            myUrl = products;
        }

        myWebView.loadUrl(myUrl);
        return view;

    }



}