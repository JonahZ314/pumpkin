# pumpkin
## Marcus Ng, Allan Wang, Joanna Zhou

### Our Design

#### HelpDesk
Our HelpDesk takes in user input and will return potential problem solutions based on keywords in the user's problem description(more info in ticket). It includes only one  method along with an ArrayPriorityQueue -
* giveSolution - Parses through collected keywords and returns a set of solutions for each keyword.
* Tickets - An ArrayPriorityQueue of type Ticket.

#### Ticket
Implements the Comparable interface so it could work with any Comparable object. It includes the following instance variables -

* vipLevel - Keeps our queue orderly. User is asked to provide their vipLevel, and we'll place them in the queue based on it. The lower the number, the higher the priority with 0 being highest priority.

* keywords - A collection of possible problem keywords(i.e. internet, turn, slow, printer) that we acquire by parsing through the user's input.

* description - A description of the user's problem, as acquired by reader input.

* name - The user's name.

* resolved - A boolean that represents the problem status of the ticket. If solved, the ticket can be removed from the queue.

* ID - A number that shows the order the tickets were added to the queue. First ticket has ID of 0, second ticket has ID of 1, and so on.

### Embellishments

We categorize potential problems into four different categories each with a single keyword representing it(internet, turn, slow, printer), and our HelpDesk will suggest a set of different solutions for each category. In addition, if a solution works, the ticket will be removed from the queue. If not, the ticket remains on the queue. 
