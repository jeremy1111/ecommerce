public class ECommerce
{
   // instance variables
   private Map<Integer, List<String>> aMap;
   // constructor
   public ECommerce()
   {
      super();
      this.aMap = new TreeMap<>();
   }

// instance methods
public void populateMap()
{
   List<String> cityList1 = new ArrayList<>(); List<String> cityList2 = new ArrayList<>();
   List<String> cityList3 = new ArrayList<>();
   cityList1.add("Birmingham"); cityList1.add("Reading");
   cityList1.add("Gloucester");
   cityList2.add("Halifax"); cityList2.add("Manchester");
   cityList2.add("Cardiff");
   cityList3.add("Edinburgh"); cityList3.add("Birmingham");
   cityList3.add("Bristol");
   this.aMap.put(1609, cityList1);
   this.aMap.put(3089, cityList2);
   this.aMap.put(2981, cityList3);
}

public void printMap()
{
   Set<Integer> itemSet = this.aMap.keySet(); 
   for (Integer eachItem : itemSet)
   {
      System.out.println("Item " + eachItem + " was viewed from " + this.aMap.get(eachItem));
   }
}

public void printMapValue(Integer anItem)
{
   if (this.aMap.containsKey(anItem))
   {
      System.out.println("Item" + anItem + " was viewed from " + this.aMap.get(anItem));
   }
   else
   {
      System.out.println("Key not present!!!");
   }
}

public void addMapEntry(Integer anItem, List<String> aCityList)
{ 
   this.aMap.put(anItem, aCityList);
}

public boolean deleteEntry(Integer anItem)
{
   if (this.aMap.containsKey(anItem))
   {
      this.aMap.remove(anItem);
      return true;
   }
   else
   {
      return false;
   }
}

/**Returns collection of all items that have been visited from aCity*/
public Set<Integer> selectKeys(String aCity)
{
   Set<Integer> someItems = new TreeSet<>();
   for (Integer eachItem : this.aMap.keySet())
   {
      for (String eachCity : this.aMap.get(eachItem))
      {
         if (eachCity.contains(aCity))
         {
            someItems.add(eachItem);
         }
      }
   }
   return someItems;
}

public void addValue(Integer anItem, String aCity)
{
   this.aMap.get(anItem).add(aCity);
}

public void deleteValue(Integer anItem, String aCity)
{
   this.aMap.get(anItem).remove(aCity);
}
