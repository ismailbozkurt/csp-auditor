package ca.gosecure.cspauditor.gui;

import ca.gosecure.cspauditor.BaseCspTest;
import ca.gosecure.cspauditor.model.ContentSecurityPolicy;
import ca.gosecure.cspauditor.util.PolicyBuilder;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CspHeadersPanelTest extends BaseCspTest {


    public static void main(String[] args) {
//        List<ContentSecurityPolicy> p = PolicyBuilder.parseCspHeaders(wrapInMap("default-src * data: blob:;script-src *.facebook.com *.fbcdn.net *.facebook.net *.google-analytics.com *.virtualearth.net *.google.com 127.0.0.1:* *.spotilocal.com:* 'unsafe-inline' 'unsafe-eval' fbstatic-a.akamaihd.net fbcdn-static-b-a.akamaihd.net *.atlassolutions.com blob: chrome-extension://lifbcibllhkdhoafpjfnlhfpfgnpldfl;style-src * 'unsafe-inline' data:;connect-src *.facebook.com *.fbcdn.net *.facebook.net *.spotilocal.com:* *.akamaihd.net wss://*.facebook.com:* https://fb.scanandcleanlocal.com:* *.atlassolutions.com attachment.fbsbx.com blob: 127.0.0.1:* http://*.serialpodcast.org https://*.serialpodcast.org;"));
//        List<ContentSecurityPolicy> p = PolicyBuilder.parseCspHeaders(wrapInMap("default-src 'self' https:; connect-src 'self' https: wss:; font-src 'self' https: data:; frame-src 'self' https: data:; img-src 'self' https: data:; media-src 'self' https: data:; object-src 'self' https:; script-src 'self' https: 'unsafe-inline' 'unsafe-eval'; style-src 'self' https: 'unsafe-inline'; report-uri /csp-report/2eeecf42-d1f1-4403-89fa-06d1b8a093c0?source%5Baction%5D=index&source%5Bcontroller%5D=home&source%5Bdomain%5D=www.shopify.ca&source%5Bsection%5D=brochure;"));
//        List<ContentSecurityPolicy> p = PolicyBuilder.parseCspHeaders(wrapInMap("script-src https://clients4.google.com/insights/consumersurveys/ 'self' 'unsafe-inline' 'unsafe-eval' https://hangouts.google.com/ https://talkgadget.google.com/ https://*.talkgadget.google.com/ https://www.googleapis.com/appsmarket/v2/installedApps/ https://www-gm-opensocial.googleusercontent.com/gadgets/js/ https://docs.google.com/static/doclist/client/js/ https://www.google.com/tools/feedback/ https://s.ytimg.com/yts/jsbin/ https://www.youtube.com/iframe_api https://ssl.google-analytics.com/ https://apis.google.com/_/scs/abc-static/ https://apis.google.com/js/ https://clients1.google.com/complete/ https://apis.google.com/_/scs/apps-static/_/js/ https://ssl.gstatic.com/inputtools/js/ https://ssl.gstatic.com/cloudsearch/static/o/js/ https://www.gstatic.com/feedback/js/ https://www.gstatic.com/common_sharing/static/client/js/ https://www.gstatic.com/og/_/js/;frame-src https://clients4.google.com/insights/consumersurveys/ https://calendar.google.com/accounts/ 'self' https://accounts.google.com/ https://apis.google.com/u/ https://apis.google.com/_/streamwidgets/ https://clients6.google.com/static/ https://content.googleapis.com/static/ https://mail-attachment.googleusercontent.com/ https://www.google.com/calendar/ https://calendar.google.com/calendar/ https://docs.google.com/ https://drive.google.com https://*.googleusercontent.com/docs/securesc/ https://feedback.googleusercontent.com/resources/ https://www.google.com/tools/feedback/ https://support.google.com/inapp/ https://*.googleusercontent.com/gadgets/ifr https://hangouts.google.com/ https://talkgadget.google.com/ https://*.talkgadget.google.com/ https://www-gm-opensocial.googleusercontent.com/gadgets/ https://plus.google.com/ https://wallet.google.com/gmail/ https://www.youtube.com/embed/ https://clients5.google.com/pagead/drt/dn/ https://clients5.google.com/ads/measurement/jn/ https://www.gstatic.com/mail/ww/ https://www.gstatic.com/mail/intl/ https://clients5.google.com/webstore/wall/ https://ci3.googleusercontent.com/ https://apis.google.com/additnow/ https://www.gstatic.com/mail/promo/;report-uri /mail/cspreport;object-src https://mail-attachment.googleusercontent.com/swfs/ https://mail-attachment.googleusercontent.com/attachment/"));
//        List<ContentSecurityPolicy> p = PolicyBuilder.parseCspHeaders(wrapInMap("default-src 'self' https://*.paypal.com https://*.paypalobjects.com https://nexus.ensighten.com 'unsafe-inline'; frame-src 'self' https://*.paypal.com https://*.paypalobjects.com https://www.youtube.com/embed/ https://www.paypal-donations.com https://www.paypal-donations.co.uk https://*.qa.missionfish.org https://www.youtube-nocookie.com; script-src 'self' https://*.paypal.com https://*.paypalobjects.com https://www.youtube.com/iframe_api https://s.ytimg.com/yts/jsbin/ https://*.t.eloqua.com https://img.en25.com/i/elqCfg.min.js https://query.yahooapis.com/ 'unsafe-inline' 'unsafe-eval'; connect-src 'self' https://*.paypal.com https://*.paypalobjects.com https://*.salesforce.com https://*.force.com https://*.eloqua.com https://nexus.ensighten.com https://storelocator.api.where.com https://api.paypal-retaillocator.com https://nominatim.openstreetmap.org https://www.paypal-biz.com; img-src 'self' * data:; object-src 'self' https://*.paypal.com https://*.paypalobjects.com; font-src 'self' https://*.paypalobjects.com;"));
//        List<ContentSecurityPolicy> p = PolicyBuilder.parseCspHeaders(wrapInMap("frame-ancestors 'self' *.spotify.com https://*.spotify.net https://*.optimizely.com  https://*.optimizelyedit.com"));
        List<ContentSecurityPolicy> p = PolicyBuilder.parseCspHeaders(wrapInMap("img-src https://* data: blob: ; connect-src https://* ws://127.0.0.1:*/ws ; media-src https://* ; object-src https://cf.dropboxstatic.com/static/ https://www.dropboxstatic.com/static/ 'self' https://flash.dropboxstatic.com https://swf.dropboxstatic.com https://dbxlocal.dropboxstatic.com ; default-src 'none' ; font-src https://* data: ; frame-src https://* carousel://* dbapi-6://* itms-apps://* itms-appss://* ; style-src https://* 'unsafe-inline' 'unsafe-eval' ; script-src https://ajax.googleapis.com/ajax/libs/jquery/ 'unsafe-eval' 'self' https://cf.dropboxstatic.com/static/javascript/ https://www.dropboxstatic.com/static/javascript/ https://cf.dropboxstatic.com/static/api/ https://www.dropboxstatic.com/static/api/ https://www.google.com/recaptcha/api/ 'nonce-yDqEXWDgP2zUUhD8Po0j' ;"));

        displayTestPolicy(p);
    }
    
    public static void displayTestPolicy(List<ContentSecurityPolicy> p) {

        JFrame frame = new JFrame("Testing frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CspHeadersPanel headers = new CspHeadersPanel();
        headers.displayPolicy(p);

        frame.add(headers.getComponent());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
