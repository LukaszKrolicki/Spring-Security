# 👺 CSRF



<figure><img src=".gitbook/assets/image (1).png" alt=""><figcaption></figcaption></figure>

fe. We go to some shady website to download game for free, it can steal our seassion Id from browser and send requests to server with this stealing our data.

CSRF- CROSS SITE REQUEST FORGERY

To resolve this every time we send request to server, server should generate Unique CSRF token

<figure><img src=".gitbook/assets/image (3).png" alt=""><figcaption></figcaption></figure>

With Spring Security you must provide CSRF token when PUT,POST,DELETE otherwise it wont work even if u pass all the correct data

How we can get CSRF token?

<figure><img src=".gitbook/assets/image (5).png" alt=""><figcaption></figcaption></figure>

<figure><img src=".gitbook/assets/image (4).png" alt=""><figcaption></figcaption></figure>

Now with this csrf-token we can acces post endpoint

<figure><img src=".gitbook/assets/image (6).png" alt=""><figcaption></figcaption></figure>

Other ways:

\-You can create new seassion every time&#x20;

\-You can make same-site so only requests from that webstie are allowed

\-You can use JWT
