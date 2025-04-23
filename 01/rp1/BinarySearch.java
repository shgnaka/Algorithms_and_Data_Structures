public class BinarySearch extends MySearch {
    
    BinarySearch(int max){
        super(max);
    }

    public boolean insert(String key, String data){
        if (maxnum > datanum) {
            MyData newData = new MyData(key, data);
            this.data[datanum] = newData;
            datanum++;
            return true;
        }else{
            return false;
        }
    }

    public MyData search(String key){
        int index = searchIndex(key);
        if (index == -1) {
            return null;
        }else{
            return data[index];
        }

    }

    public int searchIndex(String key){
        int low = 0;
        int high = datanum -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int status = strcmp(key, data[mid].getKey());
            if (status == 0) {
                return mid;
            } else if (status < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }

    public MyData delete(String key){
        int deleteDataIndex = searchIndex(key);
        if (deleteDataIndex == -1){
            return null;
        }
        MyData deletedData = data[deleteDataIndex];
        for(int i = deleteDataIndex; i < datanum - 1; i++){
            data[i] = data[i+1];
        }
        datanum--;
        return deletedData;
    }
}
