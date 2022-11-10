    File file = new File("names.txt");
    ArrayList<String> names = new ArrayList<String>();
    Scanner in = new Scanner(file);
    while (in.hasNextLine()){
        names.add(in.nextLine());
    }
    Collections.sort(names);
    for(int i=0; i<names.size(); ++i){
        System.out.println(names.get(i));
    }