## Decorations 2.0 - A configurable version of Coldie's decorations mod

Requires [WurmServerModLauncher](https://github.com/ago1024/WurmServerModLauncher/releases) to run.

This version of the mod no longer uses static ID numbers. In Coldie's version all items were based on a static templateID of 6000 and incremented by 1 for each item.
Instead, this will now utilize the ItemBuilder method which will assign the items to the next available template ID. I personally dislike static ID numbers so this was one of the reasons I re-wrote it.
Additionally, this version is configurable for every item. Each item can be configured to:
- Be Enabled or Disabled. Maybe you like the Chess items, but don't want bunnys and bears on your server.
- Set the Weight of each item. I personally found Coldie's values to be problematic and led to exploits on my server. i.e Setting the weight of an item too low basically makes it possible to do exploitative things.
- **Notice:** If you set the weight of an item, and a player creates it. Changing the weight of the item again will not change existing items, only new items created going forward. Choose weights wisely!
- Set the Value of each item. While I do not allow traders on my server and prefer Custom Traders and Buyer Merchants, this will allow you to configure the amount each item will sell for on the default Trader (Salesman) at 100ql.
- Set the Skill used for each item. This was mostly just since I decided to mod the previous two values. I found Coldie's version to be pretty consistent with the item and the skill type, but you may prefer it to be something else.

## Credits
Coldie - I want to thank for releasing this mod in its original format. It is not so often we get new models and textures in the game. At the time of writing this, Coldie has retired from Wurm Modding, but his contributions to the community were great.
He helped me on multiple occasions fix mistakes that I made in my code, my database, and just offered advice both in Wurm and in real life. I'm sure if you ever encountered Coldie on your server, it was a pleasant experience.

[Bdew](https://github.com/bdew-wurm) - While I didn't harass Bdew for help on this mod, I studied his methods of handling variables and properties and placing them in the appropriate spots thanks to his public repositories.

## Images
Custom Weight and TemplateID:

![Custom Weight and TemplateID](https://i.imgur.com/ZqlKCbo.png)

Custom Value:

![Custom Value](https://i.imgur.com/tuWE0Xj.png)

Custom Skills:

![Custom Skills](https://i.imgur.com/LMFbpwE.png)

## License - 
This mod is free software: you can redistribute it and/or modify it under the terms of the [GNU Lesser General Public License](http://www.gnu.org/licenses/lgpl-3.0.en.html) as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
