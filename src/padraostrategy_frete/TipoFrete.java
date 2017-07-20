package padraostrategy_frete;

import javax.swing.AbstractCellEditor;

public enum TipoFrete {

	
	SEDEX {
		@Override
		public Frete obterFrete() {
			
			return new Sedex();
		}
	},NORMAL {
		@Override
		public Frete obterFrete() {
			// TODO Auto-generated method stub
			return new Normal();
		}
	};
	
	public abstract Frete obterFrete();
	
	
}
