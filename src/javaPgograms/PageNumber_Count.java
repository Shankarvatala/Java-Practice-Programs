package javaPgograms;

public class PageNumber_Count {

	public static void main(String[] args) {
		boolean PaperAvaiableInTray=false;
		int NumberOfPages=10;
		int PageNumbers=1;
		for(PageNumbers=1;PageNumbers<=NumberOfPages;PageNumbers++) {
			if (PaperAvaiableInTray) {
				System.out.println("successfully lodaded page");
				System.out.println("page number:"+PageNumbers);
			}
			else {
				System.out.println("no paper in tray ");
				break;
			}
			
		}

	}

}
