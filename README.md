Qixweb: a lightweight java web framework
======

*qixweb* is a simple, easy, lightweight framework for building webapps by means of [Application Controllers](http://www.martinfowler.com/eaaCatalog/applicationController.html). It shields the application domain from web-related layers (stateless protocol, markup UI, ...).


*qixweb* was born by refactoring a few XP projects from the ground up. 
Its essential elements are:

* an abstraction of __node__, each representing a page in a browser; each node is attached to some piece of the domain, but the domain is kept separated and clean ==> nodes may be connected directly to each other or via commands, which constitutes an abstraction of navigation of the entire webapp

* an abstraction of __command__ as action that will change the domain, producing a new node ==> ie: these commands may be used to wrap easily [Prevayler](http://prevayler.org/) commands

* an abstraction of __browser__, __url__ and __link__ that keep nodes & commands well separated in turn from servlets and container aspects ==> it is therefore possible to test all the dynamic navigation logic server side without working with html, http or containers

* an abstraction of __response handler__ and __renderer__ that enables browser to use template engines like [Velocity](http://velocity.apache.org/) on one side and that opens the world of multichannel applications on the other side

## How To Start
We have a spike project that you can check as an example: [WebAppSample](http://docs.codehaus.org/display/QIX/WebAppSample).
