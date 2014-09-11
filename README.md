Qixweb: a lightweight java web framework
======

*qixweb* is a simple, easy, lightweight framework for building webapps by means of [Application Controllers](http://www.martinfowler.com/eaaCatalog/applicationController.html)

*qixweb* was born by refactoring a few XP projects from the ground up. 
Its essential elements are:

* an abstraction of _node_, each representing a page in a browser; each node is attached to some piece of the domain, but the domain is kept separated and clean ==> nodes may be connected directly to each other or via commands, which constitutes an abstraction of navigation of the entire webapp

* an abstraction of _command_ as action that will change the domain, producing a new node ==> ie: these commands may be used to wrap easily [Prevayler](http://prevayler.org/) commands

* an abstraction of _browser_, _url_ and _link_ that keep nodes & commands well separated in turn from servlets and container aspects ==> it is therefore possible to test all the dynamic navigation logic server side without working with html, http or containers

* an abstraction of _response handler_ and _renderer_ that enables browser to use template engines like [Velocity](http://velocity.apache.org/) on one side and that opens the world of multichannel applications on the other side
