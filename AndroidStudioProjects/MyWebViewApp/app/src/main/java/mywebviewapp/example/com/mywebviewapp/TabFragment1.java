package mywebviewapp.example.com.mywebviewapp;



        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.webkit.WebView;
        import android.view.ViewGroup;


public class TabFragment1 extends Fragment {

    WebView myWebView;
    final static String products = "http://pushauto.com/products/";
    String myUrl;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_1, container, false);
        myWebView = (WebView)view.findViewById(R.id.mywebview);

        myWebView.getSettings().setJavaScriptEnabled(true);

        if(myUrl==null){
            myUrl = products;
        }

        myWebView.loadUrl(myUrl);
        return view;

    }



}